package com.luizgmelo.librarysystem.dtos;

public record BookDTO(String isbn, String title, String summary, String author, String publisher,
                      String category, Integer totalPages) {}
