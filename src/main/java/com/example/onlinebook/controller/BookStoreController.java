package com.example.onlinebook.controller;

import com.example.onlinebook.model.entity.Book;
import com.example.onlinebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BookStoreController {
    @Autowired
    BookService bookService;

    @GetMapping("/bookstore")
    public String getBooks(Model model) {
        Iterable<Book> bookList = bookService.getBook();
        model.addAttribute("bookList", bookList);
        Book book = new Book();
        model.addAttribute("bookObject", "book");
        model.addAttribute("storeName", "Liberty");
        return "bookstore";
    }

    @PutMapping("/bookstore")
    public String buyBooks(@ModelAttribute Book book,) {

    }

//    @GetMapping("/welcome")
//    public String sayHello(Model model) {
//        model.addAttribute("BookSoreName", "Knowledge Power");
//        Login user = new Login();
//        model.addAttribute("user", user);
//        return "welcome";
//    }
//
//    @GetMapping("/register")
//    public String register(Model model) {
//        model.addAttribute("BookSoreName", "Knowledge Power");
//        Register register = new Register();
//        model.addAttribute("register", register);
//        return "register";
//    }
}
