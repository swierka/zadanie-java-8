public class Cube extends Shape3D {
    private double sideLength;

    public Cube(String shapeType, String name, double volume, double sideLength) {
        super(shapeType, name, volume);
        this.sideLength = sideLength;
    }

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
