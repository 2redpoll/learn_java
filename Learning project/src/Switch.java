public class Switch {
    public static void main (String[] args){
        int a = 123;

        switch (a) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Non existent");
        }
    }
}
