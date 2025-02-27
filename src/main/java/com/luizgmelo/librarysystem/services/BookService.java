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

    public Book getBookById(Long id) {
        return bookRepository.findBookById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado!"));
    }

}
