public class CycleForEach {
    public static void main(String[] args) {

        int[] a = {1, 2 ,3, 7, 2};
        int b = 1, sum = 0, m = 1;

        for (int i : a) {
            i += b;
            b++;
            System.out.print(i + " ");
        }
        System.out.println()
        ;
        //sum of the array elements
        for (int i : a) sum += i;
        System.out.println("sum = " + sum);

        //multip of first three elem.
        //not correct, since no indexes. Prob better use regula for
        //or try j++, ==3, then break
        for (int i :a) {
            System.out.println(i);
            m *= i;
            if (i > 3) break;
        }
        System.out.println("mult = " + m);

    }
}
