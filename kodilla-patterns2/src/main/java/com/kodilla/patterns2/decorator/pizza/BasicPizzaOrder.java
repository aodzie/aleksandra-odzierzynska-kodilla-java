package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(30.0);
    }

    @Override
    public String getDescription() {
        return "Pizza order";
    }
}
