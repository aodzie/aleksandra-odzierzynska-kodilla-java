package com.kodilla.good.patterns.Food2Door;

import java.util.HashSet;

public class GlutenFreeShop implements Distributor{
    HashSet<Product> productList = new HashSet<>();
    Product pizza = new Product("pizza", 39.99);
    Product pasta = new Product("pasta", 12.99);


    @Override
    public void process(Product product, Customer customer) {
        System.out.println("Nowe zamówienie :)\nDane z zamówienia: " +product.getProductName() + " " +customer.getAddress());

    }
}
