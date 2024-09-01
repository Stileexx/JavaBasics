public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Iron Man";


        {
//            i can modify the value of original variable, its not a new initialized
            a = 78;
//           values initialised in this block remain in this block
            int c = 21;
            name = "Samir";


//
        }

//        Prints Iron Man not Samir
        System.out.println(name);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            
        }
    }
}
