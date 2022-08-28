package com.abcdeveloper.rest;


import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    private Integer id;
    private String name;

    @Singular("bookName")
    private Set<String> book;

        //getters, setters, toString

    /*public void addBook(String book) {
        if (this.books == null) {
                this.books = new HashSet<>();
            }
            this.books.add(book);
        }*/
}