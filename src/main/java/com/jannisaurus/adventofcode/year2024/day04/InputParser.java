package com.jannisaurus.adventofcode.year2024.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public static String[] parseInput(String fileName) {
        try {
            // Read the input file as a single string
            String input = Files.readString(Paths.get(fileName));
            
            // Split input into rows
            String[] rows = input.split("\n");
            
            // Determine the width of the rows (assume all rows have the same length)
            int rowLength = rows[0].length();
            
            // Create a padding row of dots with the same length as the input rows
            String paddingRow = ".".repeat(rowLength);
            
            List<String> paddedRows = new ArrayList<>();
            
            // Add four rows of dots at the beginning
            for (int i = 0; i < 4; i++) {
                paddedRows.add(paddingRow);
            }
            
            // Add the actual input rows
            for (String row : rows) {
                paddedRows.add(row);
            }
            
            // Add four rows of dots at the end
            for (int i = 0; i < 4; i++) {
                paddedRows.add(paddingRow);
            }

            for (int i = 0; i < paddedRows.size(); i++) {
                paddedRows.set(i, "...." + paddedRows.get(i) + "....");
            }
            
            // Convert the list back to an array
            return paddedRows.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
