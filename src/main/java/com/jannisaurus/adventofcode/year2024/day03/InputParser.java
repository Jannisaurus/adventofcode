package com.jannisaurus.adventofcode.year2024.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputParser {

    public static String parseInput(String fileName) {

        String input = null;

        try {
            input = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        input = input.replaceAll("\\s+", "");

        return input;
    }
}
