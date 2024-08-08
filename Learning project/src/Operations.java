public class Operations {
    public static void main(String[] args) {

        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = - d;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
        System.out.println(" e = " + e);

        //floats
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;

        System.out.println(" da = " + da);
        System.out.println(" db = " + db);
        System.out.println(" dc = " + dc);
        System.out.println(" dd = " + dd);
        System.out.println(" de = " + de);

        // mod
        int ma = 37;
        System.out.println(ma + " mod 10 = " + ma % 10);

        //sostavnoi
        int sa = 0;
        sa += 4;
        System.out.println("sa = " + sa);

        //shift
        int sha = 2;
        sha <<= 2;
        System.out.println("shift " + sha);

        // & - and
        // | - or
        // ^ - xor
        // ! - not


    }
}
