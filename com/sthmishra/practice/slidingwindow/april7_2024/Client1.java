package com.sthmishra.practice.slidingwindow.april7_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Client1 {
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();

        int[] arr1 = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k1 = 3;
        if(sol1.solution(arr1, k1) == 16) System.out.println("Test1: PASS"); // Expected maximum sum: 7 + 8 + 1 = 16

        int[] arr2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k2 = 4;
        if(sol1.solution(arr2, k2) == 39) System.out.println("Test2: PASS"); // Expected maximum sum: 4 + 2 + 10 + 23 = 39

        int[] arr3 = {2, 3};
        int k3 = 2;
        if(sol1.solution(arr3, k3) == 5) System.out.println("Test3: PASS"); // Expected maximum sum: 2 + 3 = 5

        int[] arr4 = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k4 = 4;
        if(sol1.solution(arr4, k4) == 24) System.out.println("Test4: PASS"); // Expected maximum sum: 10 + 2 + 3 + 1 = 16

        int[] arr5 = {-1, -2, -3, -4, -5};
        int k5 = 2;
        if(sol1.solution(arr5, k5) == -3) System.out.println("Test5: PASS"); // Expected maximum sum: -1 + -2 = -3
    }
}
