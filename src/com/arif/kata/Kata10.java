package com.arif.kata;

import java.util.*;

public class Kata10 {
    public static void main(String[] args) {
        System.out.println(isPositiveDominant(new Integer[]{1, 1, 1, -3 - 4}));
//        System.out.println(isPositiveDominant(new Integer[]{5, 99, 832, -3, -4}));
//        System.out.println(isPositiveDominant(new int[]{1, 1, 1, -3 - 4}));
//        System.out.println(isPositiveDominant(new int[]{5, 99, 832, -3, -4}));
    }

    static boolean isPositiveDominant(Integer[] arr) {
        Set<Integer> numSet = new HashSet<>();
        int balance = 0;

        for (Integer num : arr) {
            if (numSet.contains(num)) continue;
            numSet.add(num);
            if (num > 0) balance++;
            if (num < 0) balance--;
        }
        return balance > 0 ? true : false;
    }

    public static boolean positiveDominant (Integer[] numbersArray) {
        int count = 0;
        HashMap<Integer, Integer> positiveValues = new HashMap<>();
        HashMap<Integer, Integer> negativeValues = new HashMap<>();

        for (Integer integer : numbersArray) {
            if (integer < 0) {
                negativeValues.merge(integer, count, Integer::sum);
            }
            if (integer > 0) {
                positiveValues.merge(integer, count, Integer::sum);
            }
        }
        if(positiveValues.size() > negativeValues.size()) {
            return true;
        }

        return false;
    }



    public static boolean isPositiveDominant(int[] array) {
        List<Integer> uniquePosArray = new ArrayList<>();
        List<Integer> uniqueNegArray = new ArrayList<>();

        for (int n: array) {
            if (n > 0 && !uniquePosArray.contains(n))
                uniquePosArray.add(n);
            if (n < 0 && !uniqueNegArray.contains(n))
                uniqueNegArray.add(n);
        }

        return uniquePosArray.size() > uniqueNegArray.size();
    }
}


