package com.arif.kata;

public class Kata07 {
    public static void main(String[] args) {

        System.out.println(reverse2("hello"));
        System.out.println(reverse2("world"));
        System.out.println(reverse2("a"));
        System.out.println(reverse2(""));

        increasingNumbers(1, 10);


    }

    public static String reverse1(String word) {
        String[] charWord = word.split("\\s");
        String reversedWord = "";
        for (String s : charWord) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            reversedWord += sb.toString();

        }
        return reversedWord;

    }

    public static String reverse(String word) { // this use recursion
        if (word.length() == 0) {
            return "";
        } else {
            return reverse(word.substring(1)) + word.charAt(0);
        }
    }

    public static String reverse2(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }

    public static void increasingNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isIncreasing(i))
                System.out.print(i);

        }
    }

    private static boolean isIncreasing(int i) {
        String s = String.valueOf(i);
        for (int j = 0; j < s.length()-1; j++) {
            if (s.charAt(j) > s.charAt(j + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int number) {
        if (number > 0) {
            return number + sum(number - 1);
        } else {
            return number;
        }
    }
}
