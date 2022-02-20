package com.kodilla.good.patterns.Food2Door;


public class InformationSender {

    public void getOrderDetails(Product product){
        System.out.println("Product: " + product.productName +" " + product.productPrice);
    }

    void createMessageSuccess(){
        System.out.println("Zamówienie zostało zakończone");
    }

    void createMessageFailure(){
        System.out.println("Błąd");
    }
}
