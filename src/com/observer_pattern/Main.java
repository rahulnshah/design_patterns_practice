package com.observer_pattern;

import com.sun.source.tree.NewArrayTree;

public class Main {
    public static void main(String [] args)
    {
        Newsletter newsletter = new Newsletter();
        Subscriber subscriberA = new Subscriber(newsletter);
        Subscriber subscriberB = new Subscriber(newsletter);
        Subscriber subscriberC = new Subscriber(newsletter);

        newsletter.publish("Edition 1: Observer Pattern in Java");
        newsletter.publish("Edition 2: Wolverine vs. Deadpool");
    }
}
