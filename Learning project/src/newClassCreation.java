class Box {
    double width;
    double height;
    double depth;
}

class Car {
    int spd;
    int doors;
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

        Car mers = new Car();

        mers.spd = 120;
        mers.doors = 4;

        System.out.println("Doors " + mers.doors);
        System.out.println("Speed " + mers.spd);
    }

}
