package impl;

import document.WordDocument;

public class WordDocImpl implements WordDocument {
    @Override
    public void createWord() {
        System.out.println("Creating a word doc...");
    }
}
