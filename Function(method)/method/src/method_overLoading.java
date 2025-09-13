public class method_overLoading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Amit Kalita");
        int answer = sum(2, 8);
        System.out.println(answer);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }
}
