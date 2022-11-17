package com.intel.trader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.intel.trader.Controller.MainController;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class TraderApplication {

	public static void main(String[] args) {
		MainController controller= new MainController();
		SpringApplication.run(TraderApplication.class, args);

	}

}
