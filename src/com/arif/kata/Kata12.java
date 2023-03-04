package com.arif.kata;

public class Kata12 {
    public static void main(String[] args) {

        int[][] ints = {{0, 1, 0, 1}, {0, 1, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 0}};


        char[][] chars = {{'a','b','c','d'}, {'e','f','g','h'}, {'i','j','k','l'}, {'m','n','o','p'}};
        System.out.println(chars[0][0]);




        System.out.println(mineralFormation(ints));
    }

    private static String mineralFormation1(int[][] ints) {

        boolean stalactites = false;
        boolean stalagmites = false;

        for (int i = 0; i < ints[0].length; i++) {

            if (ints[0][i] == 1) stalactites = true;
            if (ints[ints[0].length - 1][i] == 1) stalagmites = true;
        }
        if (stalactites && stalagmites) {
            return "both";
        } else if (stalactites) {
            return "stalactites";

        } else if (stalagmites) {
            return "stalagmites";
        }
        return null;

    }


    private static String mineralFormation(int[][] ints) {
        boolean hasStalactites = false;
        boolean hasStalagmites = false;

        // Check for stalactites in the first row
        for (int i = 0; i < ints[0].length; i++) {
            if (ints[0][i] == 1) {
                hasStalactites = true;
                break;  // Stop checking if a stalactite is found
            }
        }

        // Check for stalagmites in the last row
        int lastRowIndex = ints.length - 1;
        for (int i = 0; i < ints[lastRowIndex].length; i++) {
            if (ints[lastRowIndex][i] == 1) {
                hasStalagmites = true;
                break;  // Stop checking if a stalagmite is found
            }
        }

        // Determine the mineral formation type based on the presence of stalactites and stalagmites
        if (hasStalactites && hasStalagmites) {
            return "both";
        } else if (hasStalactites) {
            return "stalactites";
        } else if (hasStalagmites) {
            return "stalagmites";
        } else {
            return null;
        }
    }


}
