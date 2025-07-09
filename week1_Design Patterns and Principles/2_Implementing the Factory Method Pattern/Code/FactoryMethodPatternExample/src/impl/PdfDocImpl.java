package impl;

import document.PdfDocument;

public class PdfDocImpl implements PdfDocument {
    @Override
    public void createPdf() {
        System.out.println("Creating a pdf doc...");
    }
}
