package com.bookstores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstores.entity.MyBookList;
import com.bookstores.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository mybook;
	
	public void saveMyBook(MyBookList book) {
		mybook.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll();
		
	}
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
	
}
