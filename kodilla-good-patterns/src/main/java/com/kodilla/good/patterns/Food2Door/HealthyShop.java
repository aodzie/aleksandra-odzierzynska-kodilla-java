package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class HealthyShop implements Distributor{
    HashMap<Product, Customer> productList = new HashMap<>();

    @Override
    public void process(Product product, Customer customer) {

        System.out.println("Zamówienie HealthyShop jest wykonywane");
        System.out.println("Dane klienta: " +customer.getFirstName() +" " + customer.getLastName() +" " + customer.getAddress());

    }
}