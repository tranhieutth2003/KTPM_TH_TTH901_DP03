package com.journaldev.design.lib_observer;

//Library.java
import java.util.ArrayList;
import java.util.List;

public class Library implements Subject {
 private static Library instance;
 private List<Book> books;
 private List<Observer> observers;

 private Library() {
     books = new ArrayList<>();
     observers = new ArrayList<>();
 }

 public static Library getInstance() {
     if (instance == null) {
         instance = new Library();
     }
     return instance;
 }

 public void addBook(Book book) {
     books.add(book);
     notifyObservers("📢 Sách mới đã được thêm vào thư viện: " + book.getTitle());
 }

 public void checkOverdueBooks() {
     // Giả lập việc kiểm tra sách quá hạn
     for (Book book : books) {
         if (book.isOverdue()) {
             notifyObservers("⏳ Sách quá hạn: " + book.getTitle());
         }
     }
 }

 @Override
 public void registerObserver(Observer observer) {
     observers.add(observer);
 }

 @Override
 public void removeObserver(Observer observer) {
     observers.remove(observer);
 }

 @Override
 public void notifyObservers(String message) {
     for (Observer observer : observers) {
         observer.update(message);
     }
 }
}
