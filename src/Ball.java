public class Ball extends Shape3D {
    private double radius;

    public Ball(String shapeType, String name, double volume, double radius) {
        super(shapeType, name, volume);
        this.radius = radius;
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
