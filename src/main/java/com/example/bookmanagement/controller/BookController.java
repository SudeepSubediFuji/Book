package com.example.bookmanagement.controller;

import com.example.bookmanagement.model.Book;
import com.example.bookmanagement.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
    public class BookController {

    @Autowired
    private BookService bookService;

    // GET /api/books - Retrieve all books
    @GetMapping
    public List<Book> list() {
        return bookService.getAllBooks();
    }

    // POST /api/books - Create a new book
    @PostMapping
    public Book create(@Valid @RequestBody Book book) {
        return bookService.saveBook(book);
    }

    // DELETE /api/books/{id} - Remove a book
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}