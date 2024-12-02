package com.jannisaurus.adventofcode.year2024.day02;

import java.util.List;

public class Solution {

    // maybe a recursive function with recursive calls if the row is decreasing vs increasing?

    public static int part1(List<int[]> input) {
        int safeReports = 0;

        for (int[] arr : input) {
            if (arr == null) {
                return safeReports;
            } else {
                if (part1(arr)) {
                    safeReports++;
                }
            }


        }
        return safeReports;
    }

    public static boolean part1(int[] arr) {
        boolean ah = true; 
        for(int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length) {
                if (arr[i] > arr[i+1] && ((arr[i] - arr[i+1]) == 1 || (arr[i] - arr[i+1]) == 2)) {
                    ah = decreasing(arr);
                    return ah;
                } else if (arr[i] < arr[i+1] && ((arr[i+1] - arr[i]) == 1 || (arr[i+1] - arr[i]) == 2)) {
                    ah = increasing(arr);
                    return ah;
                }
            }

        }

        return ah;
    }

    public static boolean decreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean increasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i+1]) {
                return true;
            }
        }
        return false;
    }

    
}
