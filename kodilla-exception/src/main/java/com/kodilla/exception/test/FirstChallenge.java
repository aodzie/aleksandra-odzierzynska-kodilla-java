package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double number1 = 3;
        double number2 = 0;

        try{
            firstChallenge.divide(number1, number2);
        }catch (ArithmeticException exc){
            System.out.println("Something went wrong! "+exc);
        } finally {
            System.out.println("The end");
        }

    }
}