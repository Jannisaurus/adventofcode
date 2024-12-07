package com.jannisaurus.adventofcode.year2024.day04;

public class Solution {
    private static int result = 0;

    public static int part1(String[] input) {

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length(); j++) {
                if (checkPattern(input, i, j, 1, 0, "XMAS")) result++;
                if (checkPattern(input, i, j, 0, 1, "XMAS")) result++;
                if (checkPattern(input, i, j, 1, 1, "XMAS")) result++;
                if (checkPattern(input, i, j, 1, -1, "XMAS")) result++;

                if (checkPattern(input, i, j, 1, 0, "SAMX")) result++;
                if (checkPattern(input, i, j, 0, 1, "SAMX")) result++;
                if (checkPattern(input, i, j, 1, 1, "SAMX")) result++;
                if (checkPattern(input, i, j, 1, -1, "SAMX")) result++;
            }
        }

        return result;
    }
    private static boolean checkPattern(String[] input, int i, int j, int dx, int dy, String pattern) {
        for (int k = 0; k < pattern.length(); k++) {
            int x = i + k * dx;
            int y = j + k * dy;
            if (x < 0 || x >= input.length || y < 0 || y >= input[x].length() || input[x].charAt(y) != pattern.charAt(k)) {
                return false;
            }
        }
        return true;
    }
    
    public static int part2(String[] input) {

        return findXMAS(input);
    }

    public static int findXMAS(String[] input) {
        int count = 0;
    
        for (int i = 1; i < input.length - 1; i++) { // Avoid top and bottom edges
            for (int j = 1; j < input[i].length() - 1; j++) { // Avoid left and right edges
                if (input[i].charAt(j) == 'A') {
                    // Check diagonals for both "MAS" and "SAM"
                    boolean leftDiagonalMAS = checkDiagonal(input, i - 1, j - 1, 1, 1, "MAS");
                    boolean rightDiagonalMAS = checkDiagonal(input, i - 1, j + 1, 1, -1, "MAS");
                    boolean leftDiagonalSAM = checkDiagonal(input, i - 1, j - 1, 1, 1, "SAM");
                    boolean rightDiagonalSAM = checkDiagonal(input, i - 1, j + 1, 1, -1, "SAM");
    
                    // Increment count if both diagonals match any valid pattern
                    if ((leftDiagonalMAS || leftDiagonalSAM) && (rightDiagonalMAS || rightDiagonalSAM)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    
    private static boolean checkDiagonal(String[] input, int startRow, int startCol, int dx, int dy, String pattern) {
        for (int k = 0; k < pattern.length(); k++) {
            int x = startRow + k * dx;
            int y = startCol + k * dy;
    
            // Check bounds
            if (x < 0 || x >= input.length || y < 0 || y >= input[x].length()) {
                return false;
            }
    
            // Check character match
            if (input[x].charAt(y) != pattern.charAt(k)) {
                return false;
            }
        }
        return true;
    }
    

}
