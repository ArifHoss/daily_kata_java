package com.arif.kata;

public class Kata13 {
    public static void main(String[] args) {
        System.out.println(isDisarium(75));
        System.out.println(isDisarium(135));
    }

    private static boolean isDisarium(int number) {
        String stringNumber = String.valueOf(number);
        char[] singleDigits = stringNumber.toCharArray();
        int finalSum = 0;

        for (int i = 1; i < singleDigits.length + 1; i++) {
            finalSum += Math.pow(Character.getNumericValue(singleDigits[i - 1]), i);
        }
        return finalSum == number;
    }

    private static void isDisariumRecursive(int number, int position, int finalSum) {
        position++;
        String stringNumber = String.valueOf(number);
        char[] singleDigits = stringNumber.toCharArray();
        if(position < singleDigits.length +1) {
            finalSum += Math.pow(Character.getNumericValue(singleDigits[position -1]), position);
            isDisariumRecursive(number, position, finalSum);
            if(position == singleDigits.length) {
                System.out.println(finalSum == number);
            }
        }
    }
}
