package com.billingresturant.billing.system;

public class Menu{
    private int number;
    private String main;
    private double price;

    public Menu(int number , String main, double price){
        this.main = main;
        this.price = price;
        this.number = number;
    }
    public Menu(Menu source) {
        this.main = source.main;
        this.price = source.price;
        this.number = source.number;
    }
    public String getMain(){
        return this.main;
    }
    public double getPrice(){
        return this.price;
    }
    public int getNumber(){
        return this.number;
    }
    public void setMenu(String main) {
        this.main = main;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Main:  " + this.main + ".\n"
                + "Price:    " + this.price + ".\n";
        }
    }



