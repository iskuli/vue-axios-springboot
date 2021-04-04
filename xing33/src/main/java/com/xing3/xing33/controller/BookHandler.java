package com.xing3.xing33.controller;

import com.xing3.xing33.entiry.Book;
import com.xing3.xing33.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 这个相当于 responsebody+contorller
@RestController
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/findAll")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
