package com.example.onlinebook;

import java.util.ArrayList;
import java.util.List;

public class BuyInfoCreation {

    public BuyInfoCreation() {
    }

    public List<BuyInfo> buyInfoList = new ArrayList<>();

    public void addBuyInfo(BuyInfo buyInfo) {
        buyInfoList.add(buyInfo);
    }

    public List<BuyInfo> getBuyInfoList() {
        return buyInfoList;
    }

    public void setBuyInfoList(List<BuyInfo> buyInfoList) {
        this.buyInfoList = buyInfoList;
    }

    public void showList() {
        buyInfoList.forEach(System.out::println);
    }
}
