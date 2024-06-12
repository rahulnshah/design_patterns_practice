package com.design_pattern_1;

public class SaveMarkDown implements SaveBehavior {

    @Override
    public void save() {
        System.out.println("saving markdown");
    }
}
