package com.kodilla.good.patterns.Food2Door;


public class Food2DoorOrders {

    public static void main(String[] args) {

        Customer customer1 = new Customer("FirstName1", "LastName1", "ul. nowa1" , "333555222");

        Product pizza = new Product("pizza", 34.99);
        Product salad = new Product("Salad", 19.99);

        InformationSender informationSender = new InformationSender();
        informationSender.getOrderDetails(pizza);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process(pizza, customer1);

        informationSender.createMessageSuccess();

        informationSender.getOrderDetails(salad);
        HealthyShop healthyShop = new HealthyShop();
        healthyShop.process(salad, customer1);
        informationSender.createMessageSuccess();
    }
}
