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
    
}
