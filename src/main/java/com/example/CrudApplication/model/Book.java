package com.example.CrudApplication.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
}
