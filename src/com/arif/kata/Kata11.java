package com.arif.kata;

public class Kata11 {
    public static void main(String[] args) {

    }

    private static int addStrNums(String st1, String st2) {

        int st1IntValue = Integer.parseInt(st1);
        int st2IntValue = Integer.parseInt(st2);

        return 0;
    }


    public static String addStrNums1(String num1, String num2) {

        int carry=0;
        while(num1.startsWith("0")) {
            num1 = num1.substring(1);
        }
        while(num2.startsWith("0")) {
            num2 = num2.substring(1);
        }
        if(num1.length() < num2.length()) {
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        if(!num1.matches("^[0-9]*$"))
            return "-1";
        String out = "";
        for(int i = 0; i < num1.length() && i < num2.length(); i++) {

            int x = Integer.parseInt(""+num1.charAt(num1.length()-i-1));
            int y = Integer.parseInt(""+num2.charAt(num2.length()-i-1));
            int addi = x+y+carry;
            carry = 0;
            if(addi>= 10) {
                carry = 1;
                addi = addi-10;
            }
            out = addi+out;
        }
        if(num1.length() > num2.length()) {
            String sub = num1.substring(0,num1.length()-num2.length());
            for(int i = 0; i < sub.length() && i < sub.length(); i++) {
                int x = Integer.parseInt(""+sub.charAt(sub.length()-i-1));

                int addi = x+carry;
                carry = 0;
                if(addi>= 10) {
                    carry = 1;
                    addi = addi-10;
                }

                out = addi+out;
            }
        }
        if(carry != 0) out = carry+out;
        if(out.length()== 0) out = ""+0;

        return ""+out;
    }
}

