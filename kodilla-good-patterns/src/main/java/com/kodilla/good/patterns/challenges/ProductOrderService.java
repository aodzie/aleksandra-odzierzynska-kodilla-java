package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public static void main(String[] args) {
        InformationSender information = new InformationSender();
        ProductNotAvailable notAvailable = new ProductNotAvailable();
        Database database1 = new Database();
        User user1 = new User("Name", "LastName");
        Product product1 = new Product("1product", 32.9);


        if (database1.checkAvailability() == true){
            database1.removeProduct(product1);
            information.sendInformation(user1);
        }
        else{
            notAvailable.sendInformation(user1);
        }
    }
}