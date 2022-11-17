package com.intel.trader.repository;
import org.springframework.data.repository.CrudRepository;
import com.intel.trader.portfolio.Portfolio;
public interface PortfolioRepository extends CrudRepository<Portfolio, String> {

}