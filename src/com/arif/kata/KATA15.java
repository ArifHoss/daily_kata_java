package com.arif.kata;

public class KATA15 {
    public static void main(String[] args) {

        System.out.println(happy(203));
        System.out.println(happy(11));
        System.out.println(happy(107));

    }
    static boolean happy(int num) {
        if(num == 1) return true;
        if(num == 4) return false;
        String str = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Character.getNumericValue(str.charAt(i)), 2);
        }

        return happy(sum);
    }

    public static boolean happyPayMan(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 4) {
            return false;
        }
        return happy(("" + num).chars()
                .map(Character::getNumericValue)
                .map(i -> (int)Math.pow(i, 2))
                .sum());
    }


}
