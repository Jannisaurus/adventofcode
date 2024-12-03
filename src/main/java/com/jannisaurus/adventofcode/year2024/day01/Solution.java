package com.jannisaurus.adventofcode.year2024.day01;

import java.util.HashSet;
import java.util.Set;

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
        int similarityScore = 0;
        

        for (int i = 0; i < input.length; i++) {
            int appearances = 0;
            int first = input[i][0];

            for (int j = 0; j < input.length; j++) {
                int second = input[j][1];

                if (first == second) {
                    appearances++;
                }
            }

            similarityScore += (first * appearances);

        }
        return similarityScore;
    }


}
