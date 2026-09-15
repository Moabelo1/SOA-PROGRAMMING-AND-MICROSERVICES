package com.klef.Library_Service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.Library_Service.entity.Book;

public interface BookRepository
        extends JpaRepository<Book, Long> {

    boolean existsByIsbn(String isbn);
}