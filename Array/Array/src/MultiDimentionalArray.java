import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  2D Array - it is like a matrix
        /*
        1 2 3
        4 5 6
        7 8 9
        */

//  int[][] arr = new int[3][]
        // 3 is size of row . size of column is not necessary


        //  storing array directly
//        int[][] arr2D = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };


        //  2D array with different row and column
//        int[][] arr = {
//                {1, 2, 3},  //  0th index
//                {4, 5},  //  1st index
//                {6, 7, 8, 9}  //  2nd index -> arr[2] = {6, 7, 8, 9}
//
//        };

        int[][] arr = new int[3][2];
        System.out.print(arr.length);

        //  how to take input into an array
        //  run a for loop for every index

        for (int row = 0; row < arr.length; row++) {
            //  for each column in every row run another for loop
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


    }
}
