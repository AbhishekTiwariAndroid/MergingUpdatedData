package dev.abhishektiwari.mergingupdateddata;

import java.util.ArrayList;

public class TradeSummeryModel {
    String userId, groupname, segment;
    ArrayList<TradeModel> tradeList;




    @Override
    public String toString() {
        return "TradeSummeryModel{" +
                "userId='" + userId + '\'' +
                ", tradeList=" + tradeList +
                '}';
    }


}

