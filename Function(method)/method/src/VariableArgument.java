import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9);  //  return  an array

    }

    //  another method with multiple parameter.two integer one variable argument
    static void multiple(int a, int b, String...v) {
        //  String...v works as an Array

    }



    //  method with one variable argument
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
