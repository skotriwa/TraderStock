package com.intel.trader.administrator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
    @Id
    private String ticker;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Float stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    private Float stockPrice;
    private Integer volume;

    private Integer currentVolume;

    public Integer getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(Integer currentVolume) {
        this.currentVolume = currentVolume;
    }

    public float getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(float marketCap) {
        this.marketCap = marketCap;
    }

    private float marketCap;
    private String company;
    private Float currentPrice;
    public Stock(){

    }

}
