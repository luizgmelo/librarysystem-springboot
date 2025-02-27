package com.luizgmelo.librarysystem.repositories;

import com.luizgmelo.librarysystem.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b " +
           "FROM books b " +
           "WHERE b.id = :id ")
    Optional<Book> findBookById(Long id);
}
