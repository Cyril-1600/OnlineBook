package com.example.onlinebook.model.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private Date createTime = new Date();

    @LastModifiedDate
    @Column(nullable = false)
    private Date updateTime = new Date();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
