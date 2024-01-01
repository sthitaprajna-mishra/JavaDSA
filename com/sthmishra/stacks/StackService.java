package com.sthmishra.stacks;

import java.util.*;

public class StackService {
    // Nearest Smaller Element
    public int[] nearestSmallerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        int i = 0;
        for(int el : arr) {
            while(!stack.isEmpty() && stack.peek() >= el) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(el);
            i++;
        }
        return result;
    }
}
