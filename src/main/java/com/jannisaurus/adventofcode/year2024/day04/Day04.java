package com.jannisaurus.adventofcode.year2024.day04;

public class Day04 {
    public static void main(String[] args) {

        // start time
        long startTime = System.currentTimeMillis();

        // declare input file path
        String fileName = "src\\main\\resources\\day04_input.txt";

        // parse input using InputParser
        String[] input = InputParser.parseInput(fileName);

    
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }


        // solve problem using Solution, one static method per part
        int result = Solution.part1(input);

        System.out.println("Result (Part 1): " + result);

        int result2 = Solution.part2(input);

        System.out.println("Result (Part 2): " + result2);



        long endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + "ms");

    }
    
}
