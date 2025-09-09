import java.util.Scanner;

public class nested_switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int employeeId = in.nextInt();
        String department = in.next();

        switch (employeeId) {
            case 1:
                System.out.println("Amit Kalita");
                break;
            case 2:
                System.out.println("Lenovo Kalita");
                break;
            case 3:
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("no department selected");
                }
                break;
            default:
                System.out.println("enter correct EmployeeId");
        }
    }
}
