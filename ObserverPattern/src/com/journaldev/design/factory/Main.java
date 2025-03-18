package com.journaldev.design.factory;

//Main.java
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Chọn loại sách để thêm:");
     System.out.println("1. Sách giấy");
     System.out.println("2. Sách điện tử");
     System.out.println("3. Sách nói");
     System.out.print("Lựa chọn: ");
     int choice = scanner.nextInt();
     scanner.nextLine(); // Clear buffer

     System.out.print("Nhập tên sách: ");
     String title = scanner.nextLine();
     System.out.print("Nhập tác giả: ");
     String author = scanner.nextLine();

     BookFactory factory = null;

     switch (choice) {
         case 1:
             factory = new PhysicalBookFactory();
             break;
         case 2:
             factory = new EbookFactory();
             break;
         case 3:
             factory = new AudiobookFactory();
             break;
         default:
             System.out.println("Lựa chọn không hợp lệ!");
             return;
     }

     // Sử dụng Factory để tạo sách
     Book book = factory.createBook(title, author);
     book.displayInfo();
 }
}
