package com.referencebook.enumeration;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;
    Apple(int price) {
        this.price = price;
    }
    int getPrice() {
        return this.price;
    }
}
