package com.example.onlinebook;

public class BuyInfo {
    private Integer id;
    public Integer buyNum;

    public BuyInfo() {
    }

    public BuyInfo(Integer id) {
        this.id = id;
        this.buyNum = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    @Override
    public String toString() {
        return "BuyInfo{" +
                "id=" + id +
                ", buyNum=" + buyNum +
                '}';
    }
}