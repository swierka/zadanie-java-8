public class Rectangle extends GeometricShape {
    private double sideA;
    private double sideB;

    public Rectangle(String shapeType, String name, double perimeter, double sideA, double sideB) {
        super(shapeType, name, perimeter);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
