import java.util.Arrays;

public class methodOverloading_usingVarArgs {
    public static void main(String[] args) {
        demo(2, 4, 6, 8);
        demo("amit", "ashish", "pahu", "jit");

    }

    //  method having variable argument
    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    //  another method having variable argument
    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
