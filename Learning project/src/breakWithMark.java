public class breakWithMark {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            seccond: {
                third: {
                    System.out.println("Before break");
                    if (t) break seccond;
                    System.out.println("not executed");
                }
                System.out.println("not exec");
            }
            System.out.println("After break");

            //continue example
            for (int i = 0; i < 10; i++){
                System.out.print(i + " ");
                if (i % 2 == 0) continue;
                System.out.println("");
            }
        }
    }
}
