package com.amit;

public class CountNumber {
    public static void main(String[] args) {
        int n = 1385757879;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n + 10;  //  removes the last digit so that the loop can process the next digit in the number.
        }
        System.out.println(count);
    }
}
