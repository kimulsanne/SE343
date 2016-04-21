package com.kim.service;

import java.util.List;

import com.kim.model.Book;

public interface CartService {
	public boolean addBook(int id, Book book);
	public void deleteBook(int id);
	public void deleteAllBook();
	public List<Book> listCart();
}
