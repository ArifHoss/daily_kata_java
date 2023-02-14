package com.arif.kata;

import java.util.List;

public class Kata1 {
    public static void main(String[] args) {


        List<Object> list = List.of(1, List.of(2, 3));
        System.out.println(getLength(list));


    }

    public static int getLength(Object obj) {
        if (obj instanceof List) {
            int length = 0;
            for (Object item : (List) obj) {
                length += getLength(item);
            }
            return length;
        }
        return 1;
    }





    private static void getLength1() {

        int[][] myMultiArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};

        int arrayLength = 0;

        for (int[] arr : myMultiArray) {
            arrayLength += arr.length;
        }
        System.out.println(arrayLength);
    }

}


/*


Length of a Nested Array
The .length property on an array will return the number of elements in the array. For example, the array below contains 2 elements:

[1, [2, 3]]
// 2 elements, number 1 and array [2, 3]

Suppose we instead wanted to know the total number of non-nested items in the nested array. In the above case, [1, [2, 3]] contains 3 non-nested items, 1, 2 and 3.
Write a function that returns the total number of non-nested items in a nested array.
Examples
getLength([1, [2, 3]]) ➞ 3

getLength([1, [2, [3, 4]]]) ➞ 4

getLength([1, [2, [3, [4, [5, 6]]]]]) ➞ 6

getLength([1, [2], 1, [2], 1]) ➞ 5

can you solve this?
 */