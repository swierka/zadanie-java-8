public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double circleArea(Circle circle){
        double result = Math.PI*Math.pow(circle.getRadius(),2);
        return result;
    }

    public double rectangleArea (Rectangle rectangle){
        double result = 2*rectangle.getSideA() + 2*rectangle.getSideB();
        return result;
    }

    public double ballVolume(Ball ball) {
        double result = 4/3*Math.PI*Math.pow(ball.getRadius(),3);
        return result;
    }

    public double cubeVolume (Cube cube){
        double result = Math.pow(cube.getSideLength(),3);
        return result;
    }
}
