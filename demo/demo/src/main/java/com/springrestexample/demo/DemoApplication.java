package com.springrestexample.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static final Logger Log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Log.info("Welcome to Rest");
	}

//	@Scheduled(fixedRate = 2000L)
//	@Scheduled(fixedDelay = 3000L, initialDelay = 3000L)
//	@Scheduled(fixedDelay = "PT3S" or "PT3M" or "PT3H", initialDelay = 3000L)
	@Scheduled(cron = "*/2 * * * * *")
	public void job1() throws InterruptedException{
		Log.info("job1 current time:"+new Date());
		Thread.sleep(1000L);
	}
	@Scheduled(cron = "*/2 * * * * *")
	public void job2() throws InterruptedException{
		Log.info("job2 current time:"+new Date());
		Thread.sleep(1000L);
	}
}
