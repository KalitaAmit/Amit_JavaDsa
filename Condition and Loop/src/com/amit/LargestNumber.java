//  Q: Find the largest of three numbers
package com.amit;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //  Fist way to solve this problem
//        System.out.println("Enter number a: ");
//        int a = in.nextInt();
//        System.out.println("Enter number b: ");
//        int b = in.nextInt();
//        System.out.println("Enter number c: ");
//        int c = in.nextInt();
//
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println("maximum number is :  " + max);


        //   Another way to solve this problem
        System.out.println("Enter number a: ");
        int a = in.nextInt();
        System.out.println("Enter number b: ");
        int b = in.nextInt();
        System.out.println("Enter number c: ");
        int c = in.nextInt();


        int maximum = Math.max(c,Math.max(a, b));
        System.out.println(maximum);
    }
}
