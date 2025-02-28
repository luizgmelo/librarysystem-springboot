package com.luizgmelo.librarysystem.services;

import com.luizgmelo.librarysystem.models.Book;
import com.luizgmelo.librarysystem.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }

    public Book getOneBook(String isbn) {
        return bookRepository.findBookByIsbn(isbn)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado!"));
    }

}
