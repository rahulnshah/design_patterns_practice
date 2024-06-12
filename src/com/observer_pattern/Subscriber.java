package com.observer_pattern;

public class Subscriber implements Observer, Display{
    private String edition;
    private final Subject newsletter;

    public Subscriber(Subject newsletter)
    {
        this.newsletter = newsletter;
        this.newsletter.registerObserver(this);
    }
    @Override
    public void update(String title) {
        this.edition = title;
        display();
    }

    @Override
    public void display() {
        System.out.println("newest edition received: " + this.edition);
    }
}
