package com.journaldev.design.singleton;

//Library.java (Sử dụng Singleton Pattern)
import java.util.ArrayList;
import java.util.List;

public class Library {
 private static Library instance; // Thể hiện duy nhất của Library
 private List<Book> books; // Danh sách sách trong thư viện

 // Constructor private để ngăn chặn khởi tạo bên ngoài
 private Library() {
     books = new ArrayList<>();
 }

 // Phương thức để lấy instance duy nhất của Library
 public static Library getInstance() {
     if (instance == null) {
         instance = new Library();
     }
     return instance;
 }

 // Thêm sách vào thư viện
 public void addBook(Book book) {
     books.add(book);
 }

 // Hiển thị danh sách sách trong thư viện
 public void showBooks() {
     if (books.isEmpty()) {
         System.out.println("Thư viện không có sách nào.");
     } else {
         System.out.println("Danh sách sách trong thư viện:");
         for (Book book : books) {
             System.out.println(book);
         }
     }
 }
}
