package com.example.onlinebook.model.dao;

import com.example.onlinebook.model.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Integer> {
}
