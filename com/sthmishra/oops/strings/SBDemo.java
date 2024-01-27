package com.sthmishra.oops.strings;

public class SBDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("With great power,");
        sb.append(" comes great responsibility");
        System.out.println(sb);
        System.out.println("With great power, comes great responsibility".length());
        System.out.println(sb.capacity());

        System.out.println(sb.charAt(2));

        StringBuffer sb1 = new StringBuffer("abcdef");
        System.out.println(sb1.reverse());
        System.out.println(sb1.insert(3, "xyz"));
        System.out.println(sb1.delete(1,3));
    }
}
