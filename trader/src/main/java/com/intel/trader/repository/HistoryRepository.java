package com.intel.trader.repository;
import org.springframework.data.repository.CrudRepository;
import com.intel.trader.History.History;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.List;

public interface HistoryRepository extends CrudRepository<History, String> {
    //List<History> findByUserIn(Collection<String> names, Pageable pageable);
}