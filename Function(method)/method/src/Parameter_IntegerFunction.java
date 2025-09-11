public class Parameter_IntegerFunction {
    public static void main(String[] args) {
        // Calling sum3() and passing arguments (20 and 40)
        int ans = sum3(20, 40);
        System.out.println("The sum is: " + ans);
    }

    /*
      Method with parameters
      return_type methodName(arguments) {
          // body
          return statement;
      }
    */

    static int sum3(int a, int b) {
        // "a" and "b" are parameters (placeholders)
        int sum = a + b;
        return sum;
    }
}
