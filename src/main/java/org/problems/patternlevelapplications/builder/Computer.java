package org.problems.patternlevelapplications.builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    public Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.storage = builder.storage;
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
