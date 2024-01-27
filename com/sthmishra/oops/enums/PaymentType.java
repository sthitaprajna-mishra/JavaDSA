package com.sthmishra.oops.enums;

public enum PaymentType {
    DEBITCARD(5),
    CREDITCARD(5),
    CASH(10),
    UPI(2);

    int fee;

    PaymentType(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return this.fee;
    }
}
