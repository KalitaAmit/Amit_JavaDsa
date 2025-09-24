public class Main {
    public static void main(String[] args) {
        //  Q. store a roll number
        int a = 19;
        //  Q. store person`s name
        String name = "Amit Kalita";
        //  Q. store 5 roll number

        /*
        int rollnumber1 = 23;
        int rollnumber2 = 55;
        int rollnumber3 = 28;
        int rollnumber4 = 30;
        int rollnumber5 = 32;
        */

        //  syntax of writing an array
        //  datatype[] variable_name = new datatype[size];
        int[] rollnumber = new int[5];

        //  anotherway to writing an array
        int[] rollnumber2 = {22, 24, 26, 28, 30};


        int[] ros;  //  declaration of array. ros is getting defined in the stack. this happens at compiler time

        ros = new int[5]; //  initialisation of array actually here object is being created in the memory (heap). this happens at run time. this is called dynamic memory allocation

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);




    }
}

