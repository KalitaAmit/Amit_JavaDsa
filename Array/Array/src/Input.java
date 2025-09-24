import java.util.Arrays;
import java.util.Scanner;



public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 233;
//        arr[3] = 543;
//        arr[4] = 3;
//        //  [23, 45, 233, 545, 3]
//        System.out.println(arr[3]);


        //  Input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
        //  print the input taken from user
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));


        //  enhanced for loop / for each loop
//        for (int num : arr) { //  for every element in array, print the element
//            System.out.println(num + " ");  //  here num represent element of the array
//
//        }



        //  Arrays of object

        String[] str = new String[4];
        for( int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    //  modify
        str[1] = "amit";
        System.out.println(Arrays.toString(str));
    }
}

