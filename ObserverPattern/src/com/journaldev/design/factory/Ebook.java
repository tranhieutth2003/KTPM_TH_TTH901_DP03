package com.journaldev.design.factory;

//Ebook.java
public class Ebook extends Book {
	public Ebook(String title, String author) {
		super(title, author);
	}

	@Override
	public void displayInfo() {
		System.out.println("📱 Sách điện tử: " + title + " - Tác giả: " + author);
	}
}
