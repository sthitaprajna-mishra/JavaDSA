package com.sthmishra.oops.gc;

public class GCDemo {

    int objId;
    GCDemo(int objId) {
        this.objId = objId;
        System.out.println(this + " created");
    }

    public static void main(String[] args) {
        new GCDemo(1);
        new GCDemo(2);
        new GCDemo(3);
        new GCDemo(4);
        new GCDemo(5);

        for(int i = 1; i < 100; i++) {
            System.gc();
        }
    }

    @Override
    protected void finalize() {
        System.out.println(this + " destroyed");
    }
}
