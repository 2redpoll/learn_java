public class CycleForEach {
    public static void main(String[] args) {

        int[] a = {1, 2 ,3, 7, 2};
        int b = 0;

        for (int i : a) {
            i += b;
            b++;
            System.out.print(i + " ");
            }

    }
}
