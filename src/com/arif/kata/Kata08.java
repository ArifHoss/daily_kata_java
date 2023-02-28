package com.arif.kata;

import java.util.Arrays;

public class Kata08 {
    public static void main(String[] args) {
//        printPrimeNumbers(10);
//        printPrimeNumbers(20);
//        printPrimeNumbers(30);
        System.out.println(primeNumbers(10));
        System.out.println(primeNumbers(20));
        System.out.println(primeNumbers(30));
    }


    public static void printPrimeNumbers(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(", " + i);
                }
                for (int j = 2; i*j <= n; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        System.out.println();
        System.out.println("Total number of prime numbers up to " + n + " is " + count);
    }

    public static int primeNumbers(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                count++ ;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i ++) {
            if (n % i == 0) {
                return false;
            }
        }return true;
    }

    private static void checkIfPrime(int number) {
        int i, maxDivisor, flag = 0;
        maxDivisor = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (i = 2; i <= maxDivisor; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is a prime number.");
            }
        }
    }


    private static void checkIfPrime2(int number) {
        int i, maxDivisor = 0, flag = 0;
        maxDivisor = (int) Math.sqrt(number);
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (i = 2; i <= maxDivisor; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is a prime number.");
            }
        }
    }





    public static int countPrimeNumbers(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = 2; i*j <= n; j++) {
                    isPrime[i*j] = false;
                    System.out.println(isPrime[i*j]);
                }
            }

        }
        return count;
    }







}
