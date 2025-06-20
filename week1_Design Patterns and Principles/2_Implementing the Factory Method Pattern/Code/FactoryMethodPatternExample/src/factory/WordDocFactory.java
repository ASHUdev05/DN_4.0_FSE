package factory;

import impl.WordDocImpl;

public class WordDocFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        WordDocImpl obj = new WordDocImpl();
        obj.createWord();
    }
}
