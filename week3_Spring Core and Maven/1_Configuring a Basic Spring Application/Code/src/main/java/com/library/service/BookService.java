package com.library.service;

import com.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        List<String> books = bookRepository.findAllBooks();
        System.out.println("Available Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
