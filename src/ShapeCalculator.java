public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double shapeArea(GeometricShape shape) {
        double result = 0;
        if (shape instanceof Circle) {
            double r = ((Circle) shape).getRadius();
            result = Math.PI * Math.pow(r, 2);
        } else if (shape instanceof Rectangle) {
            double a = ((Rectangle) shape).getSideA();
            double b = ((Rectangle) shape).getSideB();
            result = 2 * a + 2 * b;
        } return result;
    }

    public double volume(Shape3D shape) {
        double result = 0;
        if (shape instanceof Ball) {
            double r = ((Ball) shape).getRadius();
            result = 4 / 3 * Math.PI * Math.pow(r, 3);
        } else if (shape instanceof Cube) {
            double a = ((Cube) shape).getSideLength();
            result = Math.pow(a, 3);
        } return result;
    }


//    public double circleArea(Circle circle){
//        double result = Math.PI*Math.pow(circle.getRadius(),2);
//        return result;
//    }
//
//    public double rectangleArea (Rectangle rectangle){
//        double result = 2*rectangle.getSideA() + 2*rectangle.getSideB();
//        return result;
//    }
//
//    public double ballVolume(Ball ball) {
//        double result = 4/3*Math.PI*Math.pow(ball.getRadius(),3);
//        return result;
//    }
//
//    public double cubeVolume (Cube cube){
//        double result = Math.pow(cube.getSideLength(),3);
//        return result;
//    }
}
