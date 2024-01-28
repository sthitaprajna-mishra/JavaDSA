package com.naveen.part2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {
    public static void main(String[] args) {
        BinaryOperator<Integer> op = (i1, i2) -> i1*i2;
        System.out.println(op.apply(2, 3));

        BiFunction<Integer,Integer,Integer> bif = (i1, i2)->i1*i2;
        System.out.println(bif.apply(2, 3));
    }
}
