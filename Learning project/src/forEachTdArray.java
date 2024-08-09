public class forEachTdArray {
    public static void main(String[] args) {
        int sum = 0;
        int [][] nums = new int[2][4];

        for (int i =0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                nums [i][j] = (i+1)*(j+1);

        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("Value: " + y);
                sum += y;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
