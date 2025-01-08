package org.problems.patternlevelapplications.decorator.fileencryptor;

class FileDataSource implements DataSource {
    private String data;

    @Override
    public String readData() {
        return data;
    }

    @Override
    public void writeData(String data) {
        this.data = data;
    }
}
