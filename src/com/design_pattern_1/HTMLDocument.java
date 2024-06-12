package com.design_pattern_1;

public class HTMLDocument extends Document{
    public HTMLDocument()
    {
        openBehavior = new OpenHTML();
        saveBehavior = new SaveHTML();
    }
}
