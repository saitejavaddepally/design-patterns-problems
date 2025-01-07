package org.problems.pattern_level_applications.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(3, "hello world");
    }

}
