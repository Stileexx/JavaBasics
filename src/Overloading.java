public class Overloading {
//    two fuctions have same name, but take different arguments
    public static void main(String[] args) {
        fun(67);
        fun(21,"Samir");
        int ans = sum(1,2, 3);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a){
        System.out.println(a);

    }

    static void fun(int c, String b){
        System.out.println(b + c);
    }
}
