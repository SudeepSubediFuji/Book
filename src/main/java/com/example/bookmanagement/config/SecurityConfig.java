//package com.example.bookmanagement.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable) // Disable CSRF for H2
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/h2-console").permitAll()// Allow H2
//                        .requestMatchers("/h2-console/**").permitAll()
//                        .requestMatchers("/api/books").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin)); // Allow H2 frames
//
//        return http.build();
//    }
//}