package com.decorator;

public abstract class Sandwich {
    String description = "Unknown Sandwich";

    public String getDescription()
    {
        return description;
    }
    public abstract double cost();
}
