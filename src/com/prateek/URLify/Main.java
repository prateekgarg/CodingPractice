package com.prateek.URLify;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Problem statement:
        testURLify();

    }

    public static void testURLify() {
        URLify trial = new URLify();
        String[] testCases = {"", " d  ", null};

        trial.setInput("Mr John Smith    ");
        System.out.println(trial.URLifyString());
    }

}
