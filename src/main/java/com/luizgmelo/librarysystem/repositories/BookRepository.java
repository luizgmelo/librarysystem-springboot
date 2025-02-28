package com.luizgmelo.librarysystem.repositories;

import com.luizgmelo.librarysystem.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM books b")
    List<Book> findAllBooks();

    @Query("SELECT b " +
           "FROM books b " +
           "WHERE b.isbn = :isbn")
    Optional<Book> findBookByIsbn(String isbn);
}
