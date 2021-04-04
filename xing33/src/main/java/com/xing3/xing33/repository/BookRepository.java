package com.xing3.xing33.repository;


import com.xing3.xing33.entiry.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Integer> { // 使用了 SpringData JPa,免去crud
}
