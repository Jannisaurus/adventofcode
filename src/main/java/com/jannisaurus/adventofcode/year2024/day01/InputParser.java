package com.jannisaurus.adventofcode.year2024.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputParser {
    public static int[][] parseInput(String fileName) {
        List<String> input = null;

        try {
            input = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] result = new int[input.size()][2];

        for (int i = 0; i < input.size(); i++) {
            String line = input.get(i).trim();
            String[] parts = line.split("\\s+");
            result[i][0] = Integer.parseInt(parts[0]);
            result[i][1] = Integer.parseInt(parts[1]);
        }

        return result;
    }

    public static int[][] sortInput(int[][] input) {
        int[] firstColumn = new int[input.length];
        int[] secondColumn = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            firstColumn[i] = input[i][0];
            secondColumn[i] = input[i][1];
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (firstColumn[i] > firstColumn[j]) {
                    int temp = firstColumn[i];
                    firstColumn[i] = firstColumn[j];
                    firstColumn[j] = temp;
                }

                if (secondColumn[i] > secondColumn[j]) {
                    int temp = secondColumn[i];
                    secondColumn[i] = secondColumn[j];
                    secondColumn[j] = temp;
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            input[i][0] = firstColumn[i];
            input[i][1] = secondColumn[i];
        }

        return input;

    }


}
