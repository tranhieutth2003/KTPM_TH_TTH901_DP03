package com.journaldev.design.singleton;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Lấy instance duy nhất của Library
     Library library = Library.getInstance();

     // Thêm sách vào thư viện
     library.addBook(new Book("Doraemon", "Fujiko F. Fujio", "Truyện tranh"));
     library.addBook(new Book("Sherlock Holmes", "Arthur Conan Doyle", "Trinh thám"));

     // Hiển thị danh sách sách
     library.showBooks();
 }
}
