package com.example.libary_management.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;
    private String name;
    private Integer quantity;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    private Set<BorrowBook> borrowBookSet;

    public Book() {
    }

    public Book(Integer bookId, String name, Integer quantity, Set<BorrowBook> borrowBookSet) {
        this.bookId = bookId;
        this.name = name;
        this.quantity = quantity;
        this.borrowBookSet = borrowBookSet;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<BorrowBook> getBorrowBookSet() {
        return borrowBookSet;
    }

    public void setBorrowBookSet(Set<BorrowBook> borrowBookSet) {
        this.borrowBookSet = borrowBookSet;
    }
}
