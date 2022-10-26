package com.billingresturant.billing.system;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ResturantBillingSystemApplication {
	public static void main(String[] args){
		Menu[] menu = new Menu[]{
				new Menu("Pizza", 10.99),
				new Menu("Lasagna", 9.99),
				new Menu("Chilli Con Cani", 9.99)
		};

	}




}
