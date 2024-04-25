package com.texas.csitthird.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")

public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Optional<Book> getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @PostMapping
    public List<Book> save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping
    public List<Book> edit(@RequestBody Book book) {
        return bookService.save(book);
    }
}
