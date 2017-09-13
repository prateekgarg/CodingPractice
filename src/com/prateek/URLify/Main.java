package com.prateek.URLify;

public class Main {

    public static void main(String[] args) {
        //Problem statement: Function to replace all the spaces in a string into %20 (like in a URL)
        //Assumption is that there is enough space at the end of the string to hold the extra characters
        testURLify();

    }

    public static void testURLify() {
        URLify trial = new URLify();
        String[] testCases = {"", " d  ", "Mr John Smith    "};
        for (String test : testCases) {
            trial.setInput(test);
            System.out.println(trial.URLifyString());
        }
    }

}
