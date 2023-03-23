package com.example.onlinebook.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer BookID;

    @Column
    String BookName;

    @Column
    Integer Prices;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    Date createTime = new Date();

    @UpdateTimestamp
    @Column(nullable = false)
    Date updateTime = new Date();

    @Column
    Integer Inventory;

    public Integer getBookID() {
        return BookID;
    }

    public void setBookID(Integer bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Integer getPrices() {
        return Prices;
    }

    public void setPrices(Integer prices) {
        Prices = prices;
    }

    public Integer getInventory() {
        return Inventory;
    }

    public void setInventory(Integer inventory) {
        Inventory = inventory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    

}
