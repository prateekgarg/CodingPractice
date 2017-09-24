package com.prateek.reverseNum;

public class reverseNum {

    public static void main(String args[]) {
        System.out.println(reverse(123));   //should return 321
        System.out.println(reverse(0));   //should return 0
        System.out.println(reverse(-123));   //should return -321
        System.out.println(reverse(111));   //should return 111
        System.out.println(reverse(1234567899));   //should return 0
        System.out.println(reverse(-2147483648));   //should return 0

    }

    public static int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            flag = true;
            x = -x;
        }
        if (x < 10 && x > -10) {
            if (flag) {
                return -1 * x;
            } else {
                return x;
            }
        }
        int result = 0;
        while (x != 0) {
            long temp = (long) result * 10;
            result = result * 10;
            if ((long) result != temp) {
                return 0;
            }
            result = result + (x % 10);
            x /= 10;
        }
        if (result < 0) {
            return 0;
        }
        if (flag) {
            return -1 * result;
        } else {
            return result;
        }
    }
}
