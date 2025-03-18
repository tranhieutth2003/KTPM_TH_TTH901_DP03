package com.journaldev.design.decorator;

//BrailleLoan.java
public class BrailleLoan extends LoanDecorator {
 public BrailleLoan(BookLoan decoratedLoan) {
     super(decoratedLoan);
 }

 @Override
 public String getDescription() {
     return super.getDescription() + " 🔠 Phiên bản chữ nổi (Braille)";
 }

 @Override
 public double getCost() {
     return super.getCost() + 3.0; // Phí cho sách chữ nổi là 3.0
 }
}
