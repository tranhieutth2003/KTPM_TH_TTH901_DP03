package com.journaldev.design.lib_observer;

//Book.java
import java.time.LocalDate;

public class Book {
 private String title;
 private LocalDate dueDate;

 public Book(String title, LocalDate dueDate) {
     this.title = title;
     this.dueDate = dueDate;
 }

 public String getTitle() {
     return title;
 }

 public boolean isOverdue() {
     return dueDate.isBefore(LocalDate.now());
 }
}
