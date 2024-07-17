public class Arrays {
    public static void main(String[] args) {

        //array
        int[] testar = new int [12];

        for (int i = 1; i <=6; i++){
            testar[i] = i + 1;
            System.out.print(testar[i] + " ");
        }
        System.out.println("simple array");

        //two dem array
        int[] [] twodemarray = new int[4] [4];
        int x = 0;

        for (int i = 0; i < 4; i++) {
            for (int j =0; j < 4; j++){
                twodemarray[i] [j] = x;
                x++;
                System.out.print(twodemarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
