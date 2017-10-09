public class GeometricShape extends Shape2D {
    double perimeter;

    public GeometricShape(String shapeType, String name, double perimeter) {
        super(shapeType, name);
        this.perimeter = perimeter;
    }

    public GeometricShape() {
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
