package com.maya.book_service.controller;

import com.maya.book_service.dao.BookRepository;
import com.maya.book_service.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booksrv")
public class BookController {

    @Autowired
    BookRepository bookRepo;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @GetMapping("/books/{bid}")
    public Book getABooks(@PathVariable int bid) {

        return this.bookRepo.findById(bid).get();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book newBook) {

        return this.bookRepo.save(newBook);
    }
}
