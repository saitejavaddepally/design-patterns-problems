package org.problems.patternlevelapplications.proxy.imageproxy;

// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Load lazily
        }
        realImage.display();
    }
}
