import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {

//        fun(2,4,2,6,2,233);
        multipleArguments(2, 1, "Samir", "Kunal");
    }

    static void multipleArguments(int a, int b, String ...v) { // ... must be in the end

    }
    static void fun (int ...v) { // ...(variable) when you dont know how much inputs to take (creates array)
        System.out.println(Arrays.toString(v));

    }
}
