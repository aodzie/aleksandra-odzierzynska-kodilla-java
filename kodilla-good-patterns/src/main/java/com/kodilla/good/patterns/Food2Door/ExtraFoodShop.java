package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Distributor{
    @Override
    public void process(Product product, Customer customer) {
        System.out.println("Zamówienie na produkt: " +product.productName + " w cenie " + product.productPrice + " jest wykonywane przez firme ExtraFoodShop ");
    }
}