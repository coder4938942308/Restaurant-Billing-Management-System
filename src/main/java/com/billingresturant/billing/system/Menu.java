package com.billingresturant.billing.system;

public class Menu{
    private String main;
    private double price;

    public Menu(String main, double price){
        this.main = main;
        this.price = price;
    }
    public Menu(Menu source) {
        this.main = source.main;
        this.price = source.price;
    }
    public String getMain(){
        return this.main;
    }
    public double getPrice(){
        return this.price;
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
