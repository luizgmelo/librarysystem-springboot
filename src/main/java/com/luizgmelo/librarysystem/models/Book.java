package com.luizgmelo.librarysystem.models;

import com.luizgmelo.librarysystem.dtos.BookDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "books")
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "isbn")
public class Book {

    @Id
    private String isbn;

    @Column(nullable = false)
    private String title;

    private String summary;

    private String author;

    private String publisher;

    private String category;

    private Integer totalPages;

    public Book(BookDTO dto) {
        this.isbn = dto.isbn();
        this.title = dto.title();
        this.summary = dto.summary();
        this.author = dto.author();
        this.publisher = dto.publisher();
        this.category = dto.category();
        this.totalPages = dto.totalPages();
    }
}
