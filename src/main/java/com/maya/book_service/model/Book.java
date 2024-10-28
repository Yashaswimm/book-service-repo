package com.maya.book_service.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Book {
    @Id

    private int bookId;
    private String bookName;
    private String bookPrice;
    private String bookAuthor;
}

