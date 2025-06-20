import factory.DocumentFactory;
import factory.ExcelDocFactory;
import factory.PdfDocFactory;
import factory.WordDocFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocFactory();
        wordFactory.createDocument();

        DocumentFactory excelFactory = new ExcelDocFactory();
        excelFactory.createDocument();

        DocumentFactory pdfFactory = new PdfDocFactory();
        pdfFactory.createDocument();
    }
}