package com.kodilla.good.patterns.challenges;

import java.util.HashSet;

public class Database {
    private Product product;

    HashSet<Product> database = new HashSet<>();

    public void addNewProduct(Product product){
        database.add(product);
    }

    public void removeProduct(Product product){
        database.remove(product);
    }

    public boolean checkAvailability(){
        if (database.contains(product)) {
            return true;
        }
        else return false;
    }

}
