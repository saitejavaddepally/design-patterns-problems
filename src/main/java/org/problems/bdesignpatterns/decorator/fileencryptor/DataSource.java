package org.problems.bdesignpatterns.decorator.fileencryptor;

public interface DataSource {
    String readData();
    void writeData(String data);
}

