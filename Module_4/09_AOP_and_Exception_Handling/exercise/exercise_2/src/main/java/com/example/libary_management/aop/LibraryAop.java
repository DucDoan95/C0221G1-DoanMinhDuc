package com.example.libary_management.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Aspect
@Component
public class LibraryAop {
    private static int count;
    @AfterReturning("execution(* com.example.libary_management.controller.BorrowBookController.borrowBook(..))")
    public void borrowBook(JoinPoint joinPoint){
        System.err.println("Have book borrow at time: "+ LocalDateTime.now());
    }

    @AfterReturning("execution(* com.example.libary_management.controller.BorrowBookController.returnBook(..))")
    public void returnBook(JoinPoint joinPoint){
        System.err.println("Have book return at time: "+ LocalDateTime.now());
    }

    @Before("execution(* com.example.libary_management.controller.HomeController.*(..))")
    public void visitorLibrary(JoinPoint joinPoint){
        System.err.println("Have "+ ++count +" visitors");
    }}
