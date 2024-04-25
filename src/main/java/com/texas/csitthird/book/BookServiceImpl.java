package com.texas.csitthird.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> save(Book book) {
        bookRepository.save(book);
        return getAll();
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);

    }

    @Override
    public Optional<Book> getById(Integer id) {
        return bookRepository.findById(id);
    }
}
