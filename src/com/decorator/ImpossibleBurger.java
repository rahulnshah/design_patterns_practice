package com.decorator;

public class ImpossibleBurger extends Sandwich{

    public ImpossibleBurger()
    {
        description = "Impossible Burger";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
