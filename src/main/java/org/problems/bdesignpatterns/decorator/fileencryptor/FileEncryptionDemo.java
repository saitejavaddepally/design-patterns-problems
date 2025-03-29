package org.problems.bdesignpatterns.decorator.fileencryptor;

public class FileEncryptionDemo {
    public static void main(String[] args) {
        DataSource file = new FileDataSource();
        DataSource encryptedFile = new EncryptionDecorator(new CompressionDecorator(file));

        encryptedFile.writeData("Sensitive Data");
        System.out.println(encryptedFile.readData());
    }
}
