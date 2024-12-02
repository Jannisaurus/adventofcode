package com.jannisaurus.adventofcode.year2024.day02;

import java.util.List;

public class Day02 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        
        String filePath = "src\\main\\resources\\day02_input.txt";

        List<int[]> input = InputParser.parseInput(filePath);

        for (int[] arr : input) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int part1 = Solution.part1(input);

        System.out.println("Part 1: " + part1);

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + "ms");

    }
}
