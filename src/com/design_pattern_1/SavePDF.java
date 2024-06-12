package com.design_pattern_1;

public class SavePDF implements SaveBehavior {

    @Override
    public void save() {
        System.out.println("saving PDF");
    }
}
