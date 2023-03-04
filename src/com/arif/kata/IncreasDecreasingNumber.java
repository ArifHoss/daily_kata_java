package com.arif.kata;

public class IncreasDecreasingNumber {
    public static void main(String[] args) {

//        increasingNumbers(1, 10);

//        decreasingNumbers(1,10);
        System.out.println(incDec(3));
    }

    public static int incDec(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= Math.pow(10, n); i++) {
            if (isIncreasing(i) || isDecreasing(i)) {
                count++;
            }
        }
        return count;
    }

    public static void increasingNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isIncreasing(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean isIncreasing(int n) {
        String s = String.valueOf(n);
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void decreasingNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isDecreasing(i)) {
                System.out.print(i+",");
            }
        }
    }

    public static boolean isDecreasing(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) < s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }


}
