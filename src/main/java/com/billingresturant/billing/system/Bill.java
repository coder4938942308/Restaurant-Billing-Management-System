package com.billingresturant.billing.system;

public class Bill {
    private double bill;

    public Bill(double bill){
        this.bill = bill;
    }
    public Bill(Bill source){
        this.bill = source.bill;
    }
}
