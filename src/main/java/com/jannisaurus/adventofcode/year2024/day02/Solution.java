package com.jannisaurus.adventofcode.year2024.day02;

import java.util.List;

public class Solution {

    public static int part1(List<int[]> input) {
        int safeReports = 0;

        for (int[] arr : input) {
            if (arr != null && isSafeReport(arr)) {
                safeReports++;
            }
        }
        return safeReports;
    }

    public static boolean isSafeReport(int[] arr) {
        if (arr.length < 2) {
            return true;
        }

        boolean increasing = true; 
        boolean decreasing = true;


        for(int i = 0; i < arr.length - 1; i ++) {
            int diff = arr[i] - arr[i + 1];

            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                return false;
            }

            if(arr[i] > arr[i+1]) {

                if (!decreasing) {
                    return false;
                }

                increasing = false;
            } 
            
            if (arr[i] < arr[i+1]) {

                if(!increasing) {
                    return false;
                }

                decreasing = false;
            }

        }
        
        return true;
    }

    public static boolean isSafeReportSpiced(int[] arr) {
        if(arr.length < 2) {
            return true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(isSafeAfterRemoving(arr, i)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isSafeAfterRemoving(int[] arr, int index) {
        int arrLength = arr.length;
        int[] temp = new int[arrLength - 1];

        for (int j = 0; j < arrLength - 1; j++) {
            if (j < index) {
                temp[j] = arr[j];
            } else {
                temp[j] = arr[j + 1];
            }
        }

        return isSafeReport(temp);
    }

    public static int part2(List<int[]> input) {
        int safeReports = 0;

        for (int[] arr : input) {

            if (arr != null && (isSafeReport(arr) || isSafeReportSpiced(arr))) {
                safeReports++;
            }
        }

        return safeReports;
    }
}
