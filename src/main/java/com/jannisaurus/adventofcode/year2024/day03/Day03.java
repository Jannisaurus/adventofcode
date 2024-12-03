package com.jannisaurus.adventofcode.year2024.day03;

public class Day03 {
    public static void main(String[] args) {

        // start time
        long startTime = System.currentTimeMillis();

        // declare input file path
        String fileName = "src\\main\\resources\\day03_input.txt";

        // parse input using InputParser
        String input = InputParser.parseInput(fileName);

        // solve problem using Solution, one static method per part
        Solution.part1(input);

        Solution.part2();

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + "ms");

    }
}
