package org.problems.pattern_level_applications.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if (logLevel == INFO){
            System.out.println("INFO : " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
