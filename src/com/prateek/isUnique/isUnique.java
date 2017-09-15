package com.prateek.isUnique;

import java.util.HashSet;

public class isUnique {
    public static void main(String args[]) {
        //Find out if all the characters in a given input string are unique or not
        //Need a solution with and without additional data structures permitted
        System.out.println("Call number 1: " + (solutionOne("abcdefgHijklmnopq12345678"))); // should return true
        System.out.println("Call number 2: " + (solutionOne("aA"))); // should return false
        System.out.println("Call number 3: " + (solutionOne(""))); // should return false
        System.out.println("Call number 4: " + (solutionOne(null))); // should return false

        System.out.println("Call number 1: " + (solutionTwo("abcdefgHijklmnopq12345678"))); // should return true
        System.out.println("Call number 2: " + (solutionTwo("aAbB"))); // should return true as we are taking 256 charset
        System.out.println("Call number 2: " + (solutionTwo("abcdefgha"))); // should return false
        System.out.println("Call number 3: " + (solutionTwo(""))); // should return false
        System.out.println("Call number 4: " + (solutionTwo(null))); // should return false
    }

    private static boolean solutionOne(String input) {
        //Special case
        if (input == null || input.equals("")) {
            return false;
        }
        //This is the solution using hashset as an intermediate DS
        input = input.toLowerCase();            //Considering A and a as being the same character
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (hs.contains(ch)) {
                return false;
            } else {
                hs.add(ch);
            }
        }
        //Reached the end of the string so there are no repetition of any charaters.
        return true;
    }

    static boolean solutionTwo(String input) {
        if (input == null || input.equals("")) {
            return false;
        }
        //Here we assume we are not dealing with Unicode, and we are just dealing with an ASCII character set.
        //If we assume just lowercase alphabetical characters, we can make do with an array of size 26
        boolean[] keeper = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            int value = input.charAt(i);
            if (keeper[value]) {
                //we have encountered this value before
                return false;
            } else {
                keeper[value] = true;
            }
        }

        //Got through the string without repetition
        return true;
    }
}
