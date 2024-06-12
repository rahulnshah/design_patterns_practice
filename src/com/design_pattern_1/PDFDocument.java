package com.design_pattern_1;

public class PDFDocument extends Document{
    public PDFDocument()
    {
        openBehavior = new OpenPDF();
        saveBehavior = new SavePDF();
    }
}
