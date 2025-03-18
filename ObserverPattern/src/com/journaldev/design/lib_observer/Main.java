package com.journaldev.design.lib_observer;

//Main.java
import java.time.LocalDate;

public class Main {
 public static void main(String[] args) {
     Library library = Library.getInstance();

     // Tạo Observer
     Observer librarian = new Librarian("Nguyễn Văn A");
     Observer user1 = new User("Trần Thị B");
     Observer user2 = new User("Lê Văn C");

     // Đăng ký Observer vào Library
     library.registerObserver(librarian);
     library.registerObserver(user1);
     library.registerObserver(user2);

     // Thêm sách mới (Observer sẽ nhận được thông báo)
     library.addBook(new Book("Doraemon", LocalDate.of(2025, 5, 1)));
     library.addBook(new Book("Sherlock Holmes", LocalDate.of(2024, 3, 10))); // Quá hạn

     // Kiểm tra sách quá hạn (Observer sẽ nhận được thông báo)
     library.checkOverdueBooks();
 }
}
