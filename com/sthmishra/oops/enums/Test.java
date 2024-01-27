package com.sthmishra.oops.enums;

public class Test {
    public static void main(String[] args) {
        PaymentType ptEnum = PaymentType.UPI;
//        System.out.println(ptEnum);

        PaymentType[] values = PaymentType.values();
        for(PaymentType el : values) {
            System.out.println(el);
            System.out.println(el.ordinal());
            System.out.println(el.getFee());
        }
    }
}
