package com.arif.random_chalange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Recursion {
    public static void main(String[] args) {

        sentence();
    }

    private static int recursive(int n) {
        if (n > 0) {
            return n + recursive(n - 1);
        } else {
            return 0;
        }
    }

    private static void sentence() {

        String sentence = "I love programming java";

        List<String> word = Arrays.stream(sentence.split("\\d")).toList();

        for (String w : word) {

        }

    }
}
