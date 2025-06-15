package factory;

import impl.ExcelDocImpl;

public class ExcelDocFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        ExcelDocImpl obj = new ExcelDocImpl();
        obj.createExcel();
    }
}
