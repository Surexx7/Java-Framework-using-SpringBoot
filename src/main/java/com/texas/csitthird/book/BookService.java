package com.texas.csitthird.book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAll();

    List<Book> save(Book book);

    void delete(Integer id);

    Optional<Book> getById(Integer id);
}
