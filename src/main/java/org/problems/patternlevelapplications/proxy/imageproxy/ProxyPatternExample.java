package org.problems.patternlevelapplications.proxy.imageproxy;

// Client
public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        System.out.println("Image will be loaded lazily...");
        image.display(); // Loads and displays
        image.display(); // Displays without loading
    }
}
