package com.jannisaurus.adventofcode.year2024.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputParser {
    // Need to parse to list of arrays with each row being one array

    public static List<int[]> parseInput(String filePath) {
        List<String> stringInput = null;

        try {
            stringInput = Files.readAllLines(Paths.get(filePath));

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<int[]> parsedInput = parseLines(stringInput);

        return parsedInput;
    }

    public static List<int[]> parseLines(List<String> lines) {
        List<int[]> result = new ArrayList<>();

        for (String line : lines) {
            int[] parsedLine = parseLine(line);
            result.add(parsedLine);
        }

        return result;

    }

    private static int[] parseLine(String line) {
        String[] parts = line.trim().split("\\s+");
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }

        return result;
    }
}
