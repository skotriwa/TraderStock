package com.intel.trader.portfolio;

import com.intel.trader.user.User;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Portfolio {
    @Id
    private String portfolioSr;
    public String getPortfolioSr() {
        return portfolioSr;
    }

    public void setPortfolioSr(String portfolioSr) {
        this.portfolioSr = portfolioSr;
    }


    private String user_Name;
    private String tickerName;

    public String getTickerName() {
        return tickerName;
    }

    public int getQtyOwned() {
        return qtyOwned;
    }
    private int qtyOwned;

    public void setTickerName(String tickerName) {
        this.tickerName = tickerName;
    }

    public void setQtyOwned(int qtyOwned) {
        this.qtyOwned = qtyOwned;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user", referencedColumnName = "user_Name")
//    @MapsId
//    private User user;
}
