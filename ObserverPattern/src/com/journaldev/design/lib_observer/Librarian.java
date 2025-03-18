package com.journaldev.design.lib_observer;

//Librarian.java
public class Librarian implements Observer {
 private String name;

 public Librarian(String name) {
     this.name = name;
 }

 @Override
 public void update(String message) {
     System.out.println("📌 Nhân viên " + name + " nhận thông báo: " + message);
 }
}
