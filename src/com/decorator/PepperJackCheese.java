package com.decorator;

public class PepperJackCheese extends SandwichDecorator {
    Sandwich sandwich;

    public PepperJackCheese(Sandwich sandwich)
    {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", Pepper Jack Cheese";
    }

    @Override
    public double cost() {
        return .20 + sandwich.cost();
    }
}
