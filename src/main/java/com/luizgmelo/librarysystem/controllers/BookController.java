package com.luizgmelo.librarysystem.controllers;

import com.luizgmelo.librarysystem.models.Book;
import com.luizgmelo.librarysystem.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<Book> getOneBook(@PathVariable String isbn) {
        Book book = bookService.getOneBook(isbn);
        return ResponseEntity.status(HttpStatus.OK).body(book);
    }
}
