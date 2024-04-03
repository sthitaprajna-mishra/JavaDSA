package com.sthmishra.practice;

public class LeetCode1 {
    public static void main(String[] args) {
        String number = "551";
        char digit = '5';
        System.out.println(new LeetCode1().removeDigit(number, digit));
    }

    public String removeDigit(String number, char digit) {
        int index = number.indexOf(digit);
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i)==digit) {
                if((i == number.lastIndexOf(digit)) || (number.charAt(i+1) > digit)) {
                    index = i;
                    break;
                }
            }
        }

        return number.substring(0, index) + number.substring(index+1);
    }
}
