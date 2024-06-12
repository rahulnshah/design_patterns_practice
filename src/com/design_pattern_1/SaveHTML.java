package com.design_pattern_1;

public class SaveHTML implements SaveBehavior {
    @Override
    public void save() {
        System.out.println("saving HTML");
    }
}
