package com.sriram.home.finance.portfolio;

import com.sriram.home.finance.portfolio.model.Portfolio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = Portfolio.class)
public class ShfPortfolioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShfPortfolioServiceApplication.class, args);
	}

}
