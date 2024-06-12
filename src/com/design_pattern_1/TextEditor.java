package com.design_pattern_1;

public class TextEditor {
    public static void main(String [] args)
    {
        Document doc = new HTMLDocument();
        doc.performOpen();
        doc.performSave();
    }
}
