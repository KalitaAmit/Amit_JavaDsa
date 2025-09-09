import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter name of desired fruit:");
        String fruit = in.next();
//        first way to so switch statement

//        switch (fruit) {
//            case "mango":
//                System.out.println("king of fruit");
//                break;
//            case "apple":
//                System.out.println("a red fruit");
//                break;
//            case "orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grape":
//                System.out.println("little fruit");
//                break;
//            default:
//                System.out.println("Enter a valid fruit");
//
//        }

        //  enhanced switch - another way to do switch statement
        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("a red fruit");
            case "orange" -> System.out.println("Round fruit");
            case "Grape" -> System.out.println("little fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
