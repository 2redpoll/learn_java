public class arrayElementSearch {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 7, 25};
        int val = 25;
        boolean found = false;

        for (int x : a) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Value found");
        else System.out.println("Value not found");
    }
}
