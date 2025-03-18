package com.journaldev.design.factory;

//AudiobookFactory.java
public class AudiobookFactory implements BookFactory {
 @Override
 public Book createBook(String title, String author) {
     return new Audiobook(title, author);
 }
}
