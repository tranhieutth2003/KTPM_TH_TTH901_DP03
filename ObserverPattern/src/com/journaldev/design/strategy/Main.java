package com.journaldev.design.strategy;

//Main.java
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Library library = Library.getInstance();

     // Thêm sách vào thư viện
     library.addBook(new Book("Doraemon", "Fujiko F. Fujio", "Truyện tranh"));
     library.addBook(new Book("Sherlock Holmes", "Arthur Conan Doyle", "Trinh thám"));
     library.addBook(new Book("Java Programming", "John Doe", "Lập trình"));
     library.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy"));

     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("\n=== MENU ===");
         System.out.println("1. Xem danh sách sách");
         System.out.println("2. Tìm kiếm sách");
         System.out.println("3. Thoát");
         System.out.print("Chọn: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Xóa buffer

         if (choice == 3) {
             System.out.println("👋 Thoát chương trình!");
             break;
         }

         switch (choice) {
             case 1:
                 library.showBooks();
                 break;
             case 2:
                 System.out.println("Chọn chiến lược tìm kiếm:");
                 System.out.println("1. Tìm theo tên");
                 System.out.println("2. Tìm theo tác giả");
                 System.out.println("3. Tìm theo thể loại");
                 System.out.print("Chọn: ");
                 int searchChoice = scanner.nextInt();
                 scanner.nextLine(); // Xóa buffer

                 System.out.print("Nhập từ khóa: ");
                 String keyword = scanner.nextLine();

                 switch (searchChoice) {
                     case 1:
                         library.setSearchStrategy(new SearchByTitle());
                         break;
                     case 2:
                         library.setSearchStrategy(new SearchByAuthor());
                         break;
                     case 3:
                         library.setSearchStrategy(new SearchByGenre());
                         break;
                     default:
                         System.out.println("❌ Lựa chọn không hợp lệ!");
                         continue;
                 }

                 library.searchBooks(keyword);
                 break;
             default:
                 System.out.println("❌ Lựa chọn không hợp lệ!");
         }
     }

     scanner.close();
 }
}
