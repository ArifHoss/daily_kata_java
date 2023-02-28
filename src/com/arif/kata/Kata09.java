package com.arif.kata;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Kata09 {
    public static void main(String[] args) {
//        System.out.println(bugger(39));
        System.out.println(buggerMelvin(39));



    }

    public static int bugger(int num) {
        if (Integer.toString(num).length() == 1) {
            return 0;
        }

        int mult = 1;
        String[] splitString = Integer.toString(num).split("");
        for (int i = 0; i < splitString.length; i++) {
            mult *= Integer.parseInt(splitString[i]);
        }
        return 1 + bugger(mult);
    }

    static int buggerMelvin(int num) {
        int count = 0;
        String numString = Integer.toString(num);

        if (numString.length()==1) return count;

        int[] numArr = new int[numString.length()];
        int currentSum = 1;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = numString.charAt(i) - '0';
        }

        for (int i = 0; i < numArr.length; i++) {
            currentSum *= numArr[i];
        }

        count++;
        return count + (buggerMelvin(currentSum));
    }

    public static void bugger3(int input, int count) {
        List<Integer> digits = Arrays.stream(String.valueOf(input)
                .split(""))
                .map((number) -> Integer.parseInt(number))
                .collect(Collectors.toList());

        if(digits.size() == 1) {
            System.out.println("Result: " + count);
        } else {
            Optional<Integer> res = digits.stream().reduce((a, b) -> a * b);
//            bugger(res.get(), count + 1);
        }
    }


}
