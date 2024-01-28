package com.naveen.part2;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
    public static void main(String[] args) {

        SupplierInterfaceConcept.getText(() -> "Royal Enfield");
        SupplierInterfaceConcept.getText(() -> "BMW");
        SupplierInterfaceConcept.getText(() -> "Yamaha");

    }

    public static void getText(Supplier<String> text) {
        System.out.println(text.get());
    }
}
