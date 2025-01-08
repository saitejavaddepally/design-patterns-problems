package org.problems.patternlevelapplications.decorator.fileencryptor;

public interface DataSource {
    String readData();
    void writeData(String data);
}

