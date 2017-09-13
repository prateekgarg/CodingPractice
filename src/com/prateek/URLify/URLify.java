package com.prateek.URLify;

public class URLify {

    //Problem statement: Function to replace all the spaces in a string into %20 (like in a URL
    //Assumption is that there is enough space at the end of the string to hold the extra characters

    private String input;

    public URLify(String string) {
        if (string == null) {
            //return null or throw an error
            System.out.println("Input is null");
        } else {
            this.input = string;
        }
    }

    public URLify() {
        //System.out.println("Use the setInput method to set the input value");
    }

    public void setInput(String string) {
        if (string == null) {
            //return null or throw an error
            System.out.println("Input is null");
        } else {
            this.input = string;
        }
    }

    public String URLifyString() {
        if (this.input == null || this.input == "") {
            return null;
        } else {
            char[] arr = this.input.toCharArray();
            System.out.println(this.input);
            //StringBuilder sb = new StringBuilder();
            int lastChar = 0;
            //learn the last character of the actual string, that is not involved with the "extra" space for our convenience
            for (int i = arr.length - 1; i >= 0; --i) {
                if (arr[i] != ' ') {
                    lastChar = i;
                    break;
                }
            }
            for (int i = arr.length - 1; i >= 0 && i != lastChar; i--) {

                if (arr[lastChar] == ' ') {
                    arr[i--] = '0';
                    arr[i--] = '2';
                    arr[i] = '%';
                    lastChar--;
                } else {
                    arr[i] = arr[lastChar];
                    lastChar--;
                }
            }
            //System.out.println(arr.toString());
            return String.valueOf(arr);
        }
    }
}
