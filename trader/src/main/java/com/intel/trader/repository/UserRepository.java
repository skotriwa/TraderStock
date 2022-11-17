package com.intel.trader.repository;
import org.springframework.data.repository.CrudRepository;
import com.intel.trader.user.*;
public interface UserRepository extends CrudRepository<User, String> {

}