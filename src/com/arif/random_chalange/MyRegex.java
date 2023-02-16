package com.arif.random_chalange;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyRegex {
    public static void main(String[] args) {
        String IP_address = "A.B.C.D";

        List<String> persons = List.of("Arif", "Erik","Melvin","Rubin","Johan","Ariff");

        persons.forEach(System.out::println);

        List<String> newPerson = persons.stream()
                .sorted()
                .toList();
        System.out.println("New person list");
        newPerson.forEach(System.out::println);


    }

    class IntegerCollection {
        private int a;
        private int b;
        private int c;

        public IntegerCollection() {
        }

        public IntegerCollection(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return "IntegerCollection{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }
    }

}
