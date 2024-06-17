package com.decorator;

public class SubwaySandwich {
    public static void main(String [] args)
    {
        Sandwich impossibleBurger = new ImpossibleBurger();

        System.out.println(impossibleBurger.getDescription() + " $" + impossibleBurger.cost());

        Sandwich sandwich2 = new BlackBeanPatty(impossibleBurger);
        sandwich2 = new Tomato(sandwich2);
        sandwich2 = new Lettuce(sandwich2);
        sandwich2 = new PepperJackCheese(sandwich2);

        System.out.println(sandwich2.getDescription() + " $" + sandwich2.cost());

    }
}
