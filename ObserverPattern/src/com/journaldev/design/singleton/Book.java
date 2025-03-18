package com.journaldev.design.singleton;

//Book.java
public class Book {
 private String title;
 private String author;
 private String genre;

 public Book(String title, String author, String genre) {
     this.title = title;
     this.author = author;
     this.genre = genre;
 }

 @Override
 public String toString() {
     return "Sách: " + title + ", Tác giả: " + author + ", Thể loại: " + genre;
 }
}
