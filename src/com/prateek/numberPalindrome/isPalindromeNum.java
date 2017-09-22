package com.prateek.numberPalindrome;

public class isPalindromeNum {
    public static void main(String args[]) {
        //Determine whether an integer is a palindrome. Do this without extra space.
        System.out.println(isPalindrome(12321)); //should return true
        System.out.println(isPalindrome(123421)); //should return false
        System.out.println(isPalindrome(-12321)); //should return true

    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int result = 0;
        while (temp != 0) {
            result = (result * 10);
            result += temp % 10;
            temp /= 10;
        }
        return x == result;
    }
}
