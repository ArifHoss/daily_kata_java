package com.arif.random_chalange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestInTest {
    public static void main(String[] args) {
//        System.out.println(returnWord("He#l*  lo"));
//        System.out.println(returnWord("he##l#hel#llo"));
//
//        System.out.println(returnWord("####"));
        System.out.println(removeHashAndPreviousChar("he##l#hel#llo"));
        System.out.println(removeHashAndPreviousChar("major# spar##ks"));
        System.out.println(removeHashAndPreviousChar("si###t boy"));
        System.out.println(removeHashAndPreviousChar("####"));

    }

    private static String returnWord(String word) {
        return word.replaceAll("[*#\\s]", "");
    }

    /**
     * Removes '#' characters and the character immediately before them from a string.
     */

    private static String removeHashAndPreviousChar(String str) {

        List<Character> newStr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!newStr.isEmpty())
                    newStr.remove(newStr.size() - 1);
            } else {
                newStr.add(str.charAt(i));
            }
        }
        return newStr.toString().replaceAll("[,#\\s]", "").replace("[", "").replace("]", "");
    }


}
