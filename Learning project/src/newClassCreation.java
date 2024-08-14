class Box {
    double width;
    double height;
    double depth;
}

public class newClassCreation {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //box volume
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Box volume = " + vol);
    }

}
