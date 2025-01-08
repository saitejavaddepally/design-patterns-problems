package org.problems.patternlevelapplications.decorator.fileencryptor;

class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData("Compressed(" + data + ")");
    }

    @Override
    public String readData() {
        return "Decompressed(" + super.readData() + ")";
    }
}
