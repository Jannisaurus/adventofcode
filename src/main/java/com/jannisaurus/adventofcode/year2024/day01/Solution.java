package com.jannisaurus.adventofcode.year2024.day01;

public class Solution {
    public static int part1(int[][] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i][0] > input[i][1]) {
                sum += input[i][0] - input[i][1];
            } else if (input[i][1] > input[i][0]) {
                sum += input[i][1] - input[i][0];
            } else {
                sum += 0;
            }
        }
        return sum;
    }

    public static int part2(int[][] input) {
        return 0;
    }
}
