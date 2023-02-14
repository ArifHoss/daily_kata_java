package com.arif.kata;

public class Kata05 {
    public static void main(String[] args) {

        System.out.println(basicCalculator(2, '+', 4));
        System.out.println(basicCalculator(6, '-', 5));
        System.out.println(basicCalculator(12, '/', 3));
        System.out.println(basicCalculator(3, '*', 4));
        System.out.println(basicCalculator(1, '/', 0));


        System.out.println(extendedCalculator1("2 + 4"));
        System.out.println(extendedCalculator1("6 - 5"));
        System.out.println(extendedCalculator1("12 / 3"));
        System.out.println(extendedCalculator1("3 * 4"));
        System.out.println(extendedCalculator1("1 / 0"));
        System.out.println(extendedCalculator1("1 x 0"));

    }

    public static Double basicCalculator(double a, char o, double b) {

        switch (o) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b == 0) {
                    return null;
                }
                return a / b;
            }
            default -> {
                return null;
            }
        }
    }


    public static Double extendedCalculator1(String s) {

        String[] parts = s.split(" ");
        double a = Double.parseDouble(parts[0].trim());
        double b = Double.parseDouble(parts[2].trim());
        char o = parts[1].charAt(0);

        return basicCalculator(a, o, b);

    }


}
