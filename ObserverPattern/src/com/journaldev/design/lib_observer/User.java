package com.journaldev.design.lib_observer;

//User.java
public class User implements Observer {
 private String name;

 public User(String name) {
     this.name = name;
 }

 @Override
 public void update(String message) {
     System.out.println("📩 Người dùng " + name + " nhận thông báo: " + message);
 }
}
