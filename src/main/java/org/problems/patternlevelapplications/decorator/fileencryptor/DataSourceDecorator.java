package org.problems.patternlevelapplications.decorator.fileencryptor;

abstract class DataSourceDecorator implements DataSource {
    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }
}
