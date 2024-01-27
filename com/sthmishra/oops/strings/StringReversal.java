package com.sthmishra.oops.strings;

public class StringReversal {

    public static String reverseOne(String actual) {
        String reversed = "";
        for(int i = actual.length()-1; i >= 0; i--) {
            reversed = reversed + actual.charAt(i);
        }
        return reversed;
    }

    public static String reverseTwo(String actual) {
        int i = 0, j = actual.length()-1;
        char[] str = actual.toCharArray();

        while(i <= j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }

    public static void main(String[] args) {
        String sample = "Hello world";
        System.out.println(StringReversal.reverseOne(sample));
        System.out.println(StringReversal.reverseTwo(sample));
    }
}
