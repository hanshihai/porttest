package com.util;

public class Protocol {

    private int state = 0;

    public String processInput(String theInput) {
        String theOutput = null;

        if (state == 0) {
            theOutput = "Knock! Knock!";
            state = 1;
        } else if (state == 1) {
            theOutput = theInput;
        }
        return theOutput;
    }
}