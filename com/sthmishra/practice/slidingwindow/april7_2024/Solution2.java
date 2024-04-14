package com.sthmishra.practice.slidingwindow.april7_2024;

import java.util.*;

public class Solution2 {
    public List<Integer> solution(int[] arr, int K) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(j < arr.length) {
            if(arr[j] < 0) queue.offer(j);

            if((j-i+1) < K) j++;
            else {
                if(!queue.isEmpty()) answer.add(arr[queue.peek()]);
                else answer.add(0);

                if(!queue.isEmpty() && queue.peek() == i) queue.poll();
                j++;
                i++;
            }
        }

        return answer;
    }
}
