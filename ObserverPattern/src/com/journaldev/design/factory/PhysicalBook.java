package com.journaldev.design.factory;

//PhysicalBook.java
public class PhysicalBook extends Book {
 public PhysicalBook(String title, String author) {
     super(title, author);
 }

 @Override
 public void displayInfo() {
     System.out.println("📕 Sách giấy: " + title + " - Tác giả: " + author);
 }
}
