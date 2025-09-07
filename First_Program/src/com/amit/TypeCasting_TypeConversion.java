package com.amit;

import java.util.Scanner;

public class TypeCasting_TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);


        //  TypeCasting example below
        int num1 = (int)(65.56f);
        System.out.println(num1);  //  retrun only interger value which is 65



        //  Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)a;
//        System.out.println(b);




//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);


        int number = 'a';
        System.out.println(number);  //  output is 97. java automatically convert a into asci value



        byte b =42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) +  " " + (i / c) + " " +  (d * s));
        // (float * byte) gives float
        // (int / char) gives int ( because char converted into int
        // (double - short) gives double
        //  float + int - double = double
        System.out.println(result);


    }

}
