package com.xing3.xing33.entiry;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {
    @Id
    private Integer id;
    private String name;
    private String author;

}
