package com.example.libary_management.model.entity;

import javax.persistence.*;

@Entity
@Table (name = "borrow_book")
public class BorrowBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_id")
    private Integer borrowId;
    private String borrowCode;

    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName = "book_id")
    private Book book;

    public BorrowBook() {
    }

    public BorrowBook(String borrowCode, Book book) {
        this.borrowCode = borrowCode;
        this.book = book;
    }

    public BorrowBook(Integer borrowId, String borrowCode, Book book) {
        this.borrowId = borrowId;
        this.borrowCode = borrowCode;
        this.book = book;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public String getBorrowCode() {
        return borrowCode;
    }

    public void setBorrowCode(String borrowCode) {
        this.borrowCode = borrowCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
