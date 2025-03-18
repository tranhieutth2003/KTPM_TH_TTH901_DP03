package com.journaldev.design.decorator;

//BasicBookLoan.java
public class BasicBookLoan implements BookLoan {
 @Override
 public String getDescription() {
     return "📖 Mượn sách cơ bản";
 }

 @Override
 public double getCost() {
     return 0; // Mặc định không tính phí cho việc mượn sách cơ bản
 }
}
