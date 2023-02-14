package com.arif.kata;

public class Kata02 {

    public static void main(String[] args) {
        // Define first matrix of size 3x4
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // Define second matrix of size 4x5
        int[][] matrix2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

        // Get the number of columns in matrix1
        int matrix1Columns = matrix1[0].length;

        // Get the number of rows in matrix1 and matrix2
        int matrix1Rows = matrix1.length;

        // Get the number of columns in matrix2
        int matrix2Columns = matrix2[0].length;

        // Get the number of rows in matrix2
        int matrix2Rows = matrix2.length;


        // Create a new matrix to store the result
        int[][] resultMatrix = new int[matrix1Rows][matrix2Columns];

        // Loop through each row of matrix1
        for (int i = 0; i < matrix1Rows; i++) {
            // Loop through each column of matrix2
            for (int j = 0; j < matrix2Columns; j++) {
                // Loop through each row of matrix2
                for (int k = 0; k < matrix1Columns; k++) {
                    // Calculate the result for this cell
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3}, {3,6,1}, {6,5,3}, {1,5,8}};
        int[][] matrix2 = {{2,3,2,3}, {1,2,3,4}, {2,7,6,5}, {2,5,8,9}, {5,3,4,5}};

        int[][] result = new int [matrix1.length][matrix2[0].length];

        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];

                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}


public class kata1 {
    public static void main(String[] args) {

        int [][] first = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int [][] second = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}};

        int result[][] = new int[3][4];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                result[i][j] = 0;
                //to always start over
                for (int k = 0; k < 4; k++) {
                    //one first row element to all column elements of second
                    result[i][j] += first[i][k] * second[k][j];
                }
                System.out.print(result[i][j]+" ");
            }
        }
    }
}

 */