package com.journaldev.design.strategy;

//Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
 private static Library instance;
 private List<Book> books;
 private SearchStrategy searchStrategy;

 private Library() {
     books = new ArrayList<>();
 }

 public static Library getInstance() {
     if (instance == null) {
         instance = new Library();
     }
     return instance;
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void setSearchStrategy(SearchStrategy searchStrategy) {
     this.searchStrategy = searchStrategy;
 }

 public void searchBooks(String keyword) {
     if (searchStrategy == null) {
         System.out.println("❌ Chưa chọn chiến lược tìm kiếm!");
         return;
     }
     List<Book> result = searchStrategy.search(books, keyword);
     if (result.isEmpty()) {
         System.out.println("❌ Không tìm thấy sách nào.");
     } else {
         System.out.println("🔍 Kết quả tìm kiếm:");
         result.forEach(System.out::println);
     }
 }

 public void showBooks() {
     if (books.isEmpty()) {
         System.out.println("📚 Thư viện không có sách nào.");
     } else {
         System.out.println("📚 Danh sách sách:");
         for (Book book : books) {
             System.out.println(book);
         }
     }
 }
}
