package com.amit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

    /*

    syntax of for loop
    for (initialisation; condition; increment/decrement) {
    //  body
    }

    */


        //  Q:Print number from 1 to 5

//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }


        //  Print number from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
////            System.out.println(num + " ");
//            System.out.println("helloworld");
//        }


        // while loop

        /*
        syntax
        while (condition) {
        //body
        }

         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 2;  //  increment by 2
//        }


        //  do while loop

        /*
        initialization
        do {
          //  body
        } while (condition);

        */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
