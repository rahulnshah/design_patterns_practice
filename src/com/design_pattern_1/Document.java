package com.design_pattern_1;

public abstract class Document {
    SaveBehavior saveBehavior;
    OpenBehavior openBehavior;

    public Document()
    {

    }
    public void performSave(){
        saveBehavior.save();
    }

    public void performOpen(){
        openBehavior.open();
    }
}
