package com.decorator;

public class Tomato extends SandwichDecorator {
    Sandwich sandwich;

    public Tomato(Sandwich sandwich)
    {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", Tomato";
    }

    @Override
    public double cost() {
        return .75 + sandwich.cost();
    }
}
