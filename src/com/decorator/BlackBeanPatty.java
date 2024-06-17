package com.decorator;

public class BlackBeanPatty extends SandwichDecorator {
    Sandwich sandwich;

    public BlackBeanPatty(Sandwich sandwich)
    {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", black bean patty";
    }

    @Override
    public double cost() {
        return 1.99 + sandwich.cost();
    }
}
