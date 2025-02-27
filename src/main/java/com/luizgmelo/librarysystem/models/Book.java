package com.luizgmelo.librarysystem.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "books")
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String summary;

    private String author;

    private String publisher;

    private String category;

    private Integer totalPages;
}
