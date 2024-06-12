package com.design_pattern_1;

public class READMEDocument extends Document{
    public READMEDocument()
    {
        saveBehavior = new SaveMarkDown();
        openBehavior = new OpenMarkDown();
    }
}
