package com.jannisaurus.adventofcode.year2024.day01;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;


public class Day01 {
    public static void main(String[] args) {
        // take input from file: src\main\resources\day01_input.txt
        String fileName = "src\\main\\resources\\day01_input.txt";

        int[][] input = InputParser.parseInput(fileName);

        InputParser.sortInput(input);

        int part1 = Solution.part1(input);

        System.out.println("Part 1: " + part1);


        // parse input usng InputParser

        // solve problem using Solution, one static method per part
    }
}