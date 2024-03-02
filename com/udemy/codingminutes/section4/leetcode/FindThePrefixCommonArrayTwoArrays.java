package com.udemy.codingminutes.section4.leetcode;


public class FindThePrefixCommonArrayTwoArrays {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] frequencyArray = new boolean[n+1];
        int[] C = new int[n];

        for(int i = 0; i < n; i++) {
            if(i != 0) C[i] = C[i-1];

            if(frequencyArray[A[i]]) {
                C[i]++;
            } else {
                frequencyArray[A[i]] = true;
            }

            if(frequencyArray[B[i]]) {
                C[i]++;
            } else {
                frequencyArray[B[i]] = true;
            }
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1,3,2,4};
        int[] B = new int[] {3,1,2,4};
        int[] C = findThePrefixCommonArray(A, B);
        for(int el : C) {
            System.out.println(el);
        }
    }
}
