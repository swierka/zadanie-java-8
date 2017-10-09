public abstract class Shape3D extends Shape {
    private double volume;

    public Shape3D(String shapeType, String name, double volume) {
        super(shapeType, name);
        this.volume = volume;
    }

    public Shape3D() { }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
    }
}
