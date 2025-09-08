package com.amit;

public class FindReverseOfNumber {
    public static void main(String[] args) {
        int number = 23597; //  our given number
        int ans = 0;  //  our answer will store here,initially initialized a value 0 into our answer
        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;  //  lowering the number from 23597 -> 2359 -> 235 -> 23 -> 2
            ans = ans * 10 + reminder;
        }
        System.out.println(ans);
    }
}
