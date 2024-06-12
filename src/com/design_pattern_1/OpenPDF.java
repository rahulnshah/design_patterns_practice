package com.design_pattern_1;

public class OpenPDF implements OpenBehavior{
    @Override
    public void open() {
        System.out.println("opening PDF");
    }
}
