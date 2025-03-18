package com.journaldev.design.decorator;

//LoanDecorator.java
public abstract class LoanDecorator implements BookLoan {
 protected BookLoan decoratedLoan;

 public LoanDecorator(BookLoan decoratedLoan) {
     this.decoratedLoan = decoratedLoan;
 }

 @Override
 public String getDescription() {
     return decoratedLoan.getDescription();
 }

 @Override
 public double getCost() {
     return decoratedLoan.getCost();
 }
}
