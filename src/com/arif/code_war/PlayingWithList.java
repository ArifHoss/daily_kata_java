package com.arif.code_war;

import java.util.Arrays;

    /*
     Given an array of integers, Find the minimum sum which is obtained from summing each two integers product.

     Notes:
     * Array/List will contain positives only.
     * Array/list will have even size

     Input >> Output Examples
     minSum({5,4,2,3}) ==> return (22)
     minSum({12,6,10,26,3,24}) ==> return (342)
     minSum({9,2,8,7,5,4,0,6}) ==> return (74)

     Explanation:
     The minimum sum obtained from summing each two integers product ,
     5*2 + 3*4 = 22
     26*3 + 24*6 + 12*10 = 342
     9*0 + 8*2 +7*4 +6*5 = 74
    */

public class PlayingWithList {
    public static void main(String[] args) {
        System.out.println(minSum(new int[]{5, 4, 2, 3}));
        System.out.println(minSum(new int[]{12, 6, 10, 26, 3, 24}));
    }

    public static int minSum(int[] passed) {
        Arrays.sort(passed); // sort the array
        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - 1 - i];
        }
        return sum;
    }

}
