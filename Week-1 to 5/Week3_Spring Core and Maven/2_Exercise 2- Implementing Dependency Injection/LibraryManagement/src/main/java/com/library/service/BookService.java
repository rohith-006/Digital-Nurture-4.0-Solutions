package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // ✅ Setter for Spring to inject the dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService: Request to display books");
        bookRepository.fetchBookData();
    }
}
