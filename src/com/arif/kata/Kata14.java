package com.arif.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata14 {
    public static void main(String[] args) {
        System.out.println(hasAlphabeticallySortedWord("Paula has a French accent."));
        System.out.println(hasAlphabeticallySortedWord("The biopsy returned negative results."));
        System.out.println(hasAlphabeticallySortedWord("She sells sea shells by the sea shore."));
    }

    private static boolean hasAlphabeticallySortedWord(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z\\s]", "").split("\\s");
        for (String word : words) {
            if (word.length() >= 3) {
                char[] chars = word.toCharArray();
                boolean sorted = true;
                sorted = isSorted(chars, sorted);
                if (sorted) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isSorted(char[] chars, boolean sorted) {
        for (int j = 1; j < chars.length; j++) {
            if (chars[j] < chars[j - 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }



    private static boolean hasAlphabeticallySortedWord1(String sentence) {
        Pattern pattern = Pattern.compile("\\b[a-z]{3,}\\b");
        Matcher matcher = pattern.matcher(sentence.toLowerCase());
        while (matcher.find()) {
            String word = matcher.group();
            char[] chars = word.toCharArray();
            boolean sorted = true;

            sorted = isSorted(chars, sorted);
//            for (int j = 1; j < chars.length; j++) {
//                if (chars[j] < chars[j - 1]) {
//                    sorted = false;
//                    break;
//                }
//            }
            if (sorted) {
                return true;
            }
        }
        return false;
    }

}
