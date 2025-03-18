package com.journaldev.design.factory;

//PhysicalBookFactory.java
public class PhysicalBookFactory implements BookFactory {
 @Override
 public Book createBook(String title, String author) {
     return new PhysicalBook(title, author);
 }
}
