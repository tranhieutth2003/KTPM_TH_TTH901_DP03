package com.journaldev.design.strategy;

//SearchStrategy.java
import java.util.List;

public interface SearchStrategy {
 List<Book> search(List<Book> books, String keyword);
}
