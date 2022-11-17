package com.intel.trader.repository;
import org.springframework.data.repository.CrudRepository;
import com.intel.trader.limit.Limit;

public interface LimitRepository extends CrudRepository<Limit, String> {

}
