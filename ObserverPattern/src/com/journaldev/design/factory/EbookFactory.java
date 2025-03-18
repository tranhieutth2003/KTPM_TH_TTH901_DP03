package com.journaldev.design.factory;

//EbookFactory.java
public class EbookFactory implements BookFactory {
 @Override
 public Book createBook(String title, String author) {
     return new Ebook(title, author);
 }
}
