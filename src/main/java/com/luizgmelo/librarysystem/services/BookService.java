package com.luizgmelo.librarysystem.services;

import com.luizgmelo.librarysystem.dtos.BookDTO;
import com.luizgmelo.librarysystem.models.Book;
import com.luizgmelo.librarysystem.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Book createBook(BookDTO bookDTO) {
        Optional<Book> bookOp = bookRepository.findBookByIsbn(bookDTO.isbn());

        if (bookOp.isPresent()) {
            throw new RuntimeException("Livro já existe.");
        }

        Book newBook = new Book(bookDTO);
        return bookRepository.save(newBook);
    }

}
