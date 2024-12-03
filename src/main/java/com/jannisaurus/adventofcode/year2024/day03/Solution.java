package com.jannisaurus.adventofcode.year2024.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    private static List<String> matches = new ArrayList<>();

    private static int result = 0;

    public static void part1(String inputString) {
        regex(inputString);
        regexNumber();
    }

    public static void part2() {

    }

    private static void regex(String inputString) {

        String regex = "mul\\(\\d+,\\d+\\)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        System.out.println(matches);

    }

    private static void regexNumber() {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);

        for (String match : matches) {
            Matcher matcher = pattern.matcher(match);
            boolean first = true;
            int firstNumber = 0;
            int secondNumber = 0;

            while (matcher.find()) {
                if (first) {
                    firstNumber = Integer.parseInt(matcher.group());
                    first = false;
                } else {
                    secondNumber = Integer.parseInt(matcher.group());
                }
            }

            result += firstNumber * secondNumber;
            System.out.println("Result: " + result);
        }

    }
    
}
