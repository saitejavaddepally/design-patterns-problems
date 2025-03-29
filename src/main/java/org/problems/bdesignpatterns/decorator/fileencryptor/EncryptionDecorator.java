package org.problems.bdesignpatterns.decorator.fileencryptor;

class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData("Encrypted(" + data + ")");
    }

    @Override
    public String readData() {
        return "Decrypted(" + super.readData() + ")";
    }
}
