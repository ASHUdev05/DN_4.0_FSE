package factory;

import impl.PdfDocImpl;

public class PdfDocFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        PdfDocImpl obj = new PdfDocImpl();
        obj.createPdf();
    }
}
