package com.naveen.part2;

import java.util.function.Function;

public class FunctionInterfaceConcept {
    public static void main(String[] args) {
        Function<Integer, Integer> functionObj = (val)->val*2;
        int result = functionObj.apply(2);
        System.out.println(result);

        Function<String, Integer> findLength = (val)->val.length();

        int ans = findLength.andThen(functionObj).apply("Hello");
        System.out.println(ans);
    }
}
