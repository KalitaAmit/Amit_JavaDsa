package com.amit;

public class Conditionals {
    public static void main(String[] args) {
        /*
                         syntax of if statement
               if(boolean statement  true or false) {
                       do this
               } else {
                   do this
               }
         */


        //  Example of if statement
//        int salary = 25400;
//        if(salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);


        //  multiple if statement

        int salary = 254000;
        if (salary > 10000) {
            salary += 2000;  //  salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;

        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}