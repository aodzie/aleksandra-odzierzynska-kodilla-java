package com.kodilla.good.patterns.challenges;

public class InformationSender implements InformationService {

        public void sendInformation(User user) {
            System.out.println("Send information about the purchase to user: " + user.getUserName() + " " + user.getUserLastName());
    }
}
