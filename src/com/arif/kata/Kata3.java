package com.arif.kata;

public class Kata3 {
    public static void main(String[] args) {


        System.out.println(canComplete("butl", "beautiful"));
//        System.out.println(canComplete("butlz", "beautiful"));
//        System.out.println(canComplete("tulb", "beautiful"));
//        System.out.println(canComplete("bbutl", "beautiful"));


    }

    public static boolean canComplete(String inputString, String targetWord) {
        // Initialize two pointers
        int inputPointer = 0, targetPointer = 0;
        // Loop until either 'inputPointer' reaches the end of the 'inputString' or 'targetPointer' reaches the end of the 'targetWord'
        while (inputPointer < inputString.length() && targetPointer < targetWord.length()) {
            // If a character in the inputString matches the character in the targetWord at the same position
            if (inputString.charAt(inputPointer) == targetWord.charAt(targetPointer)) {
                //Increment inputPointer
                inputPointer++;
            }
            // Increment targetPointer regardless of whether the characters match or not
            targetPointer++;
        }
        return inputPointer == inputString.length();
    }



    // Erik Hanstad

//    private static boolean canComplete1(String part, String full) {
//        int partLength = part.length();
//    }

}

