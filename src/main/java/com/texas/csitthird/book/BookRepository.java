package com.texas.csitthird.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

