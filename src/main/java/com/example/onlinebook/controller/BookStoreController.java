package com.example.onlinebook.controller;

import com.example.onlinebook.BuyInfo;
import com.example.onlinebook.BuyInfoCreation;
import com.example.onlinebook.model.entity.Book;
import com.example.onlinebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class BookStoreController {
    @Autowired
    BookService bookService;

    private List<BuyInfo> allbuyInfoCreation = new ArrayList<>();

    public BookStoreController() {
        for (int i = 1; i <= 4; i++) {
            allbuyInfoCreation.add(new BuyInfo(i));
        }
    }

    @GetMapping("/bookstore")
    public String showBooks(Model model) {
        Iterable<Book> bookList = bookService.getBook();
        model.addAttribute("bookList", bookList);

        BuyInfoCreation buyInfoCreation = new BuyInfoCreation();
        buyInfoCreation.setBuyInfoList(allbuyInfoCreation);

        buyInfoCreation.showList();

        model.addAttribute("buyInfoCreation", buyInfoCreation);
        return "bookstore";
    }

    @PostMapping("/bookstore")
    public String update(@ModelAttribute BuyInfoCreation buyInfoCreation, Model model) {
        Iterable<Book> bookList = bookService.getBook();
        Iterator<Book> bookList_Iter = bookList.iterator();
        Iterator<BuyInfo> buyInfo_Iter = buyInfoCreation.buyInfoList.iterator();

        while (buyInfo_Iter.hasNext()) {
            bookService.updateBook(buyInfo_Iter.next().getId(), buyInfo_Iter.next().getBuyNum());
        }

        buyInfoCreation.showList();

        model.addAttribute("bookList", bookList);
        model.addAttribute("buyInfoCreation", buyInfoCreation);
        return "bookstore";
    }
}