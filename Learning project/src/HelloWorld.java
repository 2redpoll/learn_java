public class HelloWorld {
    public static void main (String [] args) {
        System.out.println("Hello world!");

        int a = 4, b = 26;
        int c = a + b;
        System.out.println(c);

        int d = 4, e = 6;
        int f = d + e;
        System.out.println("Text here. Sum of " + d + " + " + e + " = " + f);

        for (int i = 0; i < 6; i++) {
            System.out.println("Iteration " + i);
        }

        if (a > b) System.out.println("big numba " + a);
        else System.out.println("Bigga namba " + b);

        // test comment test 1234
    }
}
