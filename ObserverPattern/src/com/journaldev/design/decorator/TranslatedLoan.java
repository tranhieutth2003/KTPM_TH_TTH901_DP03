package com.journaldev.design.decorator;

//TranslatedLoan.java
public class TranslatedLoan extends LoanDecorator {
 private String language;

 public TranslatedLoan(BookLoan decoratedLoan, String language) {
     super(decoratedLoan);
     this.language = language;
 }

 @Override
 public String getDescription() {
     return super.getDescription() + " 🌍 Bản dịch tiếng " + language;
 }

 @Override
 public double getCost() {
     return super.getCost() + 4.0; // Phí dịch là 4.0
 }
}
