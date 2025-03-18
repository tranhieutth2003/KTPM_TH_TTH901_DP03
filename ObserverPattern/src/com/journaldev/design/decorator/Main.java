package com.journaldev.design.decorator;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Mượn sách cơ bản
     BookLoan loan1 = new BasicBookLoan();
     System.out.println(loan1.getDescription() + " | Tổng phí: $" + loan1.getCost());

     // Mượn sách có bản dịch
     BookLoan loan2 = new TranslatedLoan(new BasicBookLoan(), "Pháp");
     System.out.println(loan2.getDescription() + " | Tổng phí: $" + loan2.getCost());

     // Mượn sách chữ nổi (Braille) + gia hạn
     BookLoan loan3 = new ExtendedLoan(new BrailleLoan(new BasicBookLoan()));
     System.out.println(loan3.getDescription() + " | Tổng phí: $" + loan3.getCost());

     // Mượn sách có bản dịch + gia hạn
     BookLoan loan4 = new ExtendedLoan(new TranslatedLoan(new BasicBookLoan(), "Nhật"));
     System.out.println(loan4.getDescription() + " | Tổng phí: $" + loan4.getCost());
 }
}
