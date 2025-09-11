import java.util.Scanner;

public class Parameter_stringFunction {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();
        String personalizedMessage = myGreet(name);
        System.out.println(personalizedMessage);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }

}
