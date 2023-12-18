package ru.kk.jdbc.repository;

import ru.kk.jdbc.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookById(Long id);
}
