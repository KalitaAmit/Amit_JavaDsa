import java.util.Scanner;

public class Returning_value {
    public static void main(String[] args) {
        int answer = sum2();
        System.out.println(answer);
    }

    //  return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum2 = num1 + num2;
        return sum2;  //  return basically means function is end here
    }
}
