package dev.abhishektiwari.mergingupdateddata;

public class TradeModel {
    public String sr;
    public String userId;
    public String symbol;
    public String expiry;
    public String bfq;
    public String netq;
    public String cfq;
    public String groupname;
    public String segment;
    public String product;   //you can add more


    @Override
    public String toString() {
        return "TradeModel{" +
                "sr='" + sr + '\'' +
                ", userId='" + userId + '\'' +
                ", accountCode='" + product + '\'' +
                ", symbol='" + symbol + '\'' +
                ", expiry='" + expiry + '\'' +
                ", bfq='" + bfq + '\'' +
                ", netq='" + netq + '\'' +
                ", cfq='" + cfq + '\'' +
                '}';
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getBfq() {
        return bfq;
    }

    public void setBfq(String bfq) {
        this.bfq = bfq;
    }

    public String getNetq() {
        return netq;
    }

    public void setNetq(String netq) {
        this.netq = netq;
    }

    public String getCfq() {
        return cfq;
    }

    public void setCfq(String cfq) {
        this.cfq = cfq;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
