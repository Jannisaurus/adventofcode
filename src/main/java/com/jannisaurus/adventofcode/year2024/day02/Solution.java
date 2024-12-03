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
        if(arr.length < 3) {
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

/*
 Alternative solution from AI for learning purposes

package com.jannisaurus.adventofcode.year2024.day02;

import java.util.List;

public class Solution {

    // Part 1: Count safe reports
    public static int part1(List<int[]> input) {
        int safeReports = 0;

        for (int[] report : input) {
            if (isSafeReport(report)) {
                safeReports++;
            }
        }
        return safeReports;
    }

    // Part 2: Count reports safe with the Problem Dampener
    public static int part2(List<int[]> input) {
        int safeReports = 0;

        for (int[] report : input) {
            if (isSafeReport(report) || canBeMadeSafe(report)) {
                safeReports++;
            }
        }
        return safeReports;
    }

    // Check if a report is safe
    private static boolean isSafeReport(int[] report) {
        if (report.length < 2) {
            return true; // Single-element or empty arrays are always safe
        }

        boolean increasing = true, decreasing = true;

        for (int i = 0; i < report.length - 1; i++) {
            int diff = report[i + 1] - report[i];

            // Differences must be in range [1, 3] or [-3, -1]
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                return false;
            }

            // Check monotonicity
            if (diff > 0) {
                decreasing = false;
            } else if (diff < 0) {
                increasing = false;
            }

            // If neither increasing nor decreasing, it's not monotonic
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }

    // Check if a report can be made safe by removing one level
    private static boolean canBeMadeSafe(int[] report) {
        if (report.length < 3) {
            return true; // Removing one level from a small report always makes it safe
        }

        for (int i = 0; i < report.length; i++) {
            if (isSafeWithOneRemoved(report, i)) {
                return true; // Found a safe configuration
            }
        }
        return false; // No safe configuration found
    }

    // Check if a report is safe after virtually removing one level
    private static boolean isSafeWithOneRemoved(int[] report, int skipIndex) {
        boolean increasing = true, decreasing = true;
        int prev = -1; // To simulate the element before the current one

        for (int i = 0; i < report.length; i++) {
            if (i == skipIndex) continue; // Skip the removed element

            if (prev != -1) {
                int diff = report[i] - prev;

                // Differences must be in range [1, 3] or [-3, -1]
                if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                    return false;
                }

                // Check monotonicity
                if (diff > 0) {
                    decreasing = false;
                } else if (diff < 0) {
                    increasing = false;
                }

                // If neither increasing nor decreasing, it's not monotonic
                if (!increasing && !decreasing) {
                    return false;
                }
            }

            prev = report[i];
        }

        return true;
    }
}
*/