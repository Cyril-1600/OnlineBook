package com.example.onlinebook.service;

import com.example.onlinebook.model.dao.BookDao;
import com.example.onlinebook.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    // 取得所有書籍
    public Iterable<Book> getBook() {
        return bookDao.findAll();
    }

    // 前端使用者購買書本，所以後端的庫存數要更新
    public void updateBook(Integer id, Integer amount) {
        Book book = bookDao.findById(id).get();
        book.setInventory(book.getInventory() - amount);
        bookDao.save(book);
    }
}