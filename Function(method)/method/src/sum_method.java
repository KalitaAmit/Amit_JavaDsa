import java.util.Scanner;

public class sum_method {
    public static void main(String[] args) {
        sum();
        sum();
    }
    //  syntax of simple function
    /*
   return_type  name () {
    //  body
    return statement
    */

    static void sum() {

        //  this method is static because we are calling this on psvm which is static.



        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }


}
