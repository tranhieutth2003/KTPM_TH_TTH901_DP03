package com.journaldev.design.strategy;

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

 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public String getGenre() {
     return genre;
 }

 @Override
 public String toString() {
     return "📖 " + title + " - " + author + " (" + genre + ")";
 }
}
