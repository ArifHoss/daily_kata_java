package com.arif.kata;

public class Kata2 {
    public static void main(String[] args) {

        // Define first matrix of size 3x4
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // Define second matrix of size 4x5
        int[][] matrix2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

        // Calculate the result of matrix multiplication
        int[][] resultMatrix = matrixMultiplication(matrix1, matrix2);

        // Print the result matrix
        for (int[] matrix : resultMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
//        for (int i = 0; i < resultMatrix.length; i++) {
//            for (int j = 0; j < resultMatrix[i].length; j++) {
//                System.out.print(resultMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        // Get the number of columns in matrix1
        int matrix1Columns = matrix1[0].length;

        // Get the number of rows in matrix1 and matrix2
        int matrix1Rows = matrix1.length;
        int matrix2Rows = matrix2.length;

        // Get the number of columns in matrix2
        int matrix2Columns = matrix2[0].length;

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

        // Return the result matrix
        return resultMatrix;

    }

}


/*
Kata for Tuesday: 2023-02-07
Write a piece of code in Java to do the following:
define a 2-dimensional array (matrix) of size 3*4 and initialize it with some arbitrary values.
define a 2-dimensional array (matrix) of size 4*5 and initialize it with some arbitrary values.
write a piece of code that calculates the matrix multiplication of above ones.
print the result in console output.
If due to any reason, you don't have Java up and running, do this in JavaScript. (edited)
 */

/*
Use case:

Matrix multiplication is a fundamental operation in many areas of computer science and mathematics, including:

Linear algebra: Matrix multiplication is used to solve linear equations and study properties of vector spaces.

Graphics and computer vision: Matrix multiplication is used for transforming and projecting points in 3D space.

Machine learning: Matrix multiplication is used to perform linear transformations in neural networks and other machine learning models.

Scientific computing: Matrix multiplication is used to solve systems of partial differential equations in fields like physics and engineering.

Data analysis: Matrix multiplication can be used to calculate dot products, singular value decompositions, and eigenvalue problems, which are important for understanding relationships in data.

So, in a sense, matrix multiplication is a building block for a wide range of important applications and tools.
 */