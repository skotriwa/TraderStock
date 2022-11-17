package com.intel.trader.stockprice;

import com.intel.trader.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.intel.trader.repository.StockRepository;
import com.intel.trader.administrator.Stock;

import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StockPrice {
    StockRepository stockRepository;
    public Iterable<Stock> getStockPrice() {
        // This returns a JSON or XML with the users
        System.out.println("Price fetched");
        return stockRepository.findAll();
    }

    public static float randomStockPrice(String tickerName){
        //get initial/current price of ticker from stock table
        // generate a random value with +/- 10% value and over write it




        return 0;
    }
}
