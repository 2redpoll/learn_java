public class While {
    public static void main(String[] args) {
        int a = 0;

        while (a < 5) {
            a++;
            System.out.println(a);

        }

        System.out.println("End of while cycle.");

        do {
            System.out.println(a);
            } while (a-- > 1);

        System.out.println("end of do-while cycle.");
    }
}
