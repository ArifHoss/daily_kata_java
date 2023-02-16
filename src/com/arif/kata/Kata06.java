package com.arif.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata06 {
    public static void main(String[] args) {

        System.out.println(translateWord("flag"));
        System.out.println(translateWord("Apple"));
        System.out.println(translateWord("button"));
        System.out.println(translateWord(""));
        System.out.println(translateSentence("I like to eat honey waffles"));
        System.out.println(translateSentence("Do you think it is going to rain today?"));

    }

    private static final String VOWELS = "aeiouAEIOU";

    public static String translateWord(String pigLatin) {

        if (pigLatin.isEmpty()) {
            // If the word is empty, return an empty string
            return "";
        }
        char firstChar = pigLatin.charAt(0);
        String restOfWord = pigLatin.substring(1);
        String result = "";

        // If the word start with vowel, simply add "yay" to the end
        if (VOWELS.indexOf(firstChar) >= 0) {
            result = pigLatin + "yay";
        } else {
            // If the word start with consonant, find the index of the vowel
            Pattern pattern = Pattern.compile("[aeiouAEIOU]");
            Matcher matcher = pattern.matcher(pigLatin);

            // Use a regular expression to find the index of the first vowel in the word
            // If no vowel is found, default to 1 (the second letter)
            int index = matcher.find() ? matcher.start() : 1;

            // If there are no vowels, simply add "ay" to the end
            if (index == -1) {
                result = restOfWord + "ay";
            } else {

                // Otherwise, split the word into the consonants before the vowel and the rest of the word
                String consonants = pigLatin.substring(0, index);
                String resOfWordAfterVowel = pigLatin.substring(index);
                // Move the consonants to the end and add "ay"
                result = resOfWordAfterVowel + consonants + "ay";
            }
        }
        // Preserve original capitalization
        if (Character.isUpperCase(firstChar)) {
            result = Character.toUpperCase(result.charAt(0)) + result.substring(1).toLowerCase();
        }

        return result;
    }


    // Translates a sentence into Pig Latin
    public static String translateSentence(String sentence) {
        if (sentence.isEmpty()) {
            // If the sentence is empty, return an empty string
            return "";
        }
        // Use regular expression to split sentence into words
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(sentence);
        StringBuilder result = new StringBuilder();
        int lastMatchEnd = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String word = sentence.substring(start, end);
            String translatedWord = translateWord(word);
            // Append the non-word characters between words
            result.append(sentence.substring(lastMatchEnd, start));
            // Append the translated word
            result.append(translatedWord);
            lastMatchEnd = end;
        }
        // Append any remaining non-word characters at the end of the sentence
        result.append(sentence.substring(lastMatchEnd));
        return result.toString();
    }
}



/*
The find() method of the Matcher class searches for the next occurrence of the regular expression pattern in the input string. If it finds a match, it returns true and the start() method returns the index of the first character in the match. If it doesn't find a match, it returns false.

In the line int index = matcher.find() ? matcher.start() : 1;, we're using the ternary operator to assign a value to the variable index. If matcher.find() returns true, we set index to the index of the first vowel (i.e., the index returned by matcher.start()). If matcher.find() returns false (i.e., there are no vowels in the word), we set index to 1, which is the index of the second letter in the word.
 */