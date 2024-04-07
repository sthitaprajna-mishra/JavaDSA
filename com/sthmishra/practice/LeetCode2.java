package com.sthmishra.practice;

import java.util.*;

public class LeetCode2 {
    public static void main(String[] args) {

    }

    public int countLatticePoints(int[][] circles) {
        Set<String> points = new HashSet<>();

        for(int[] circle : circles) {
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];

            int lx = x-r;
            int rx = x+r;
            int uy = y+r;
            int by = y-r;

            for(int m = lx; m <= rx; m++) {
                for(int n = uy; n >= by; n--) {
                    if(isInsideCircle(m, n, circle)) {
                        points.add(m + "-" + n);
                    }
                }
            }
        }

        return points.size();
    }

    public boolean isInsideCircle(int x, int y, int[] circle) {
        int x1 = circle[0];
        int y1 = circle[1];
        int r = circle[2];

        return findDistance(x, y, x1, y1) <= Math.pow(r, 2);
    }

    public int findDistance(int x1, int y1, int x2, int y2) {
        return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
    }
}
