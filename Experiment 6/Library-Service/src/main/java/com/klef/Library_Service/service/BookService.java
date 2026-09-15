  package com.klef.Library_Service.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.Library_Service.entity.Book;
import com.klef.Library_Service.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    // ADD BOOK
    public Book addBook(Book book) {

        if (bookRepository.existsByIsbn(
                book.getIsbn())) {

            throw new RuntimeException(
                    "Book with this ISBN already exists"
            );
        }

        return bookRepository.save(book);
    }

    // VIEW ALL BOOKS
    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    // VIEW ONE BOOK
    public Book getBookById(Long id) {

        return bookRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Book not found with ID: "
                                + id
                        )
                );
    }

    // UPDATE BOOK
    public Book updateBook(
            Long id,
            Book updatedBook) {

        Book existingBook =
                getBookById(id);

        existingBook.setTitle(
                updatedBook.getTitle()
        );

        existingBook.setAuthor(
                updatedBook.getAuthor()
        );

        existingBook.setIsbn(
                updatedBook.getIsbn()
        );

        return bookRepository.save(
                existingBook
        );
    }

    // DELETE BOOK
    public void deleteBook(Long id) {

        Book book = getBookById(id);

        bookRepository.delete(book);
    }
}