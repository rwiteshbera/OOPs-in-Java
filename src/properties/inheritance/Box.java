package properties.inheritance;

public class Box {
    private double length;
    private double height;
    private double width;

    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    // Cube
    Box (double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    Box (double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box ");
    }
}
