package com.billingresturant.billing.system;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

@SpringBootApplication
public class ResturantBillingSystemApplication {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Menu[] menu = new Menu[]{
				new Menu("Pizza", 10.99),
				new Menu("Lasagna", 9.99),
				new Menu("Chilli Con Cani", 9.99),
				new Menu("Stir Fry" , 8.99)
		};
		System.out.println("How Many People?");
		System.out.println("Enter How Many:   ");
		int customers = scan.nextInt();
		for (int i = 0; i <= customers; i++){
			System.out.println("Person:  " + i);
			}



		}
	}


