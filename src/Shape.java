public abstract class Shape {
    private String shapeType;
    private String name;

    public Shape(String shapeType, String name) {
        this.shapeType = shapeType;
        this.name = name;
    }

    public Shape() {
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
