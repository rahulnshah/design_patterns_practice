package com.design_pattern_1;

public class OpenMarkDown implements  OpenBehavior {
    @Override
    public void open() {
        System.out.println("saving markdown");
    }
}
