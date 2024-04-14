package com.sthmishra.practice.slidingwindow.april7_2024;

public class Solution1 {
    public int solution(int[] arr, int K) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        int sum = 0;
        int answer = Integer.MIN_VALUE;

        while(j < n) {
            sum += arr[j];

            if((j-i+1) < K) {
                j++;
            }
            else {
                answer = Math.max(sum, answer);
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return answer;
    }
}
