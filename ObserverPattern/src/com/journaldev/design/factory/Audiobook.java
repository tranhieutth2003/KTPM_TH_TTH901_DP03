package com.journaldev.design.factory;

//Audiobook.java
public class Audiobook extends Book {
 public Audiobook(String title, String author) {
     super(title, author);
 }

 @Override
 public void displayInfo() {
     System.out.println("🎧 Sách nói: " + title + " - Tác giả: " + author);
 }
}
