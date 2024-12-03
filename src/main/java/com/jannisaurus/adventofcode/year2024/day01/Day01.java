package com.jannisaurus.adventofcode.year2024.day01;

import java.util.HashSet;
import java.util.Set;

public class Day01 {
    public static void main(String[] args) {

        // start time
        long startTime = System.currentTimeMillis();

        // declare input file path
        String fileName = "src\\main\\resources\\day01_input.txt";

        // parse input using InputParser
        int[][] input = InputParser.parseInput(fileName);

        InputParser.sortInput(input);

        // solve problem using Solution, one static method per part
        int part1 = Solution.part1(input);

        System.out.println("Part 1: " + part1);

        int part2 = Solution.part2(input);

        System.out.println("Part 2: " + part2);

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + "ms");

    }
}