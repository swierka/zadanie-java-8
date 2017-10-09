public class ShapesTester {
    public static void main(String[] args) {

        ShapeCalculator calc1 = new ShapeCalculator();

        //BALL
        Ball ball1 = new Ball(5.5);
        System.out.println("Objętność kuli o promieniu " + ball1.getRadius() + " to: " + calc1.ballVolume(ball1));

        //CUBE
        Cube cube1 = new Cube(5.34);
        System.out.println("Objętość szescianu o boku: " + cube1.getSideLength() + " to: " + calc1.cubeVolume(cube1));

        //RECTANGLE
        Rectangle rectangle1 = new Rectangle(4.5, 8.34);
        System.out.println("Pole prostokata o bokach: " + rectangle1.getSideA() + " i " + rectangle1.getSideB() + " to: " + calc1.rectangleArea(rectangle1));

        //CIRCLE
        Circle circle1 = new Circle(7.233);
        System.out.println("Pole kola o promieniu " + circle1.getRadius() + " to: " + calc1.circleArea(circle1));

        //Line
        Line2D line1 = new Line2D(-2, 3, 4, 6);
        System.out.println("Długość odcinka, ktorego punkty A i B maja współrzędne A(" + line1.x1 + "," + line1.y1 + "), B(" + line1.x2 + "," + line1.y2 + ") wynosi " + calc1.lineLength(line1));
    }
}
