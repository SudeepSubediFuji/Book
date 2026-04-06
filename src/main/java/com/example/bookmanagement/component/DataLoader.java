package com.example.bookmanagement.component;

import com.example.bookmanagement.model.Book;
import com.example.bookmanagement.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataLoader(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Loading data to the BookRepository");

        Book book1 = new Book(null,"some1","sudh","080-78787878");
        Book book2 = new Book(null,"some2","oldy","08-098989985");
        Book book3 = new Book(null,"some3","goldy","9090-900900");

        bookRepository.saveAll(List.of(book1,book2,book3));

        System.out.println("Data Loaded successfully!");
    }


}
