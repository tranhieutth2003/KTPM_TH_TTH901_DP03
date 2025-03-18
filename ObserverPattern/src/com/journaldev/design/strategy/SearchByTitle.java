package com.journaldev.design.strategy;

//SearchByTitle.java
import java.util.List;
import java.util.stream.Collectors;

public class SearchByTitle implements SearchStrategy {
 @Override
 public List<Book> search(List<Book> books, String keyword) {
     return books.stream()
             .filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
             .collect(Collectors.toList());
 }
}
