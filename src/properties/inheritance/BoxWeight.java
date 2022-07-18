package properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);
        this.weight = weight;
    }
}
