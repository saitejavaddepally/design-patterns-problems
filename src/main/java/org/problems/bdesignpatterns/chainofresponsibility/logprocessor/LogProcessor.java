package org.problems.bdesignpatterns.chainofresponsibility.logprocessor;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){
        if (nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        }
    }


}
