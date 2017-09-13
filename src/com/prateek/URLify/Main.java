package com.prateek.URLify;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Problem statement: Convert the string given to URL format
        //That means, all spaces convert to '%20'
        testURLify();

    }

    public static void testURLify() {
        URLify trial = new URLify();
        String[] testCases = {"", " d  ", null, "Mr John Smith    "};
        for (String test : testCases) {
            trial.setInput(test);
            System.out.println(trial.URLifyString());
        }
    }

}
