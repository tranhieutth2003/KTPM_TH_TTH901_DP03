package com.journaldev.design.strategy;

//SearchByGenre.java
import java.util.List;
import java.util.stream.Collectors;

public class SearchByGenre implements SearchStrategy {
 @Override
 public List<Book> search(List<Book> books, String keyword) {
     return books.stream()
             .filter(book -> book.getGenre().toLowerCase().contains(keyword.toLowerCase()))
             .collect(Collectors.toList());
 }
}
