package com.intel.trader.repository;
import org.springframework.data.repository.CrudRepository;
import com.intel.trader.administrator.Stock;
public interface StockRepository extends CrudRepository<Stock, String> {

}