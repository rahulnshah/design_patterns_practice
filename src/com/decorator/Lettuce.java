package com.decorator;

public class Lettuce extends SandwichDecorator {
    Sandwich sandwich;

    public Lettuce(Sandwich sandwich)
    {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", Lettuce";
    }

    @Override
    public double cost() {
        return .89 + sandwich.cost();
    }
}
