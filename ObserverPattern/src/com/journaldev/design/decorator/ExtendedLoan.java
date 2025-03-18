package com.journaldev.design.decorator;

//ExtendedLoan.java
public class ExtendedLoan extends LoanDecorator {
 public ExtendedLoan(BookLoan decoratedLoan) {
     super(decoratedLoan);
 }

 @Override
 public String getDescription() {
     return super.getDescription() + " ➕ Gia hạn thời gian mượn";
 }

 @Override
 public double getCost() {
     return super.getCost() + 5.0; // Phí gia hạn là 5.0
 }
}
