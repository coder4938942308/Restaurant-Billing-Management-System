package com.billingresturant.billing.system;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class ResturantBillingSystemApplication {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Menu[] menu = new Menu[]{
				new Menu(1, "Pizza", 10.99),
				new Menu(2, "Lasagna", 9.99),
				new Menu(3, "Chilli Con Cani", 9.99),
				new Menu(4, "Stir Fry" , 8.99)
		};
		System.out.println("How Many People?");
		System.out.println("Enter How Many:   ");
		int customers = scan.nextInt();
		for (int i = 0; i <= customers -1; i++) {
			System.out.println("Person:  " + i);
			for (int j = 0; j < menu.length; j++) {
				System.out.println(menu[j]);

			}
			System.out.println("What Would You Like");

			int mealNumber = scan.nextInt();
			double cost = Menu[i].getPrice;
			Bill[] bill  = new Bill[]{

			};
		}

		}
	}


