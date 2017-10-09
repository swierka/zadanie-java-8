public class ShapesTester {

    public static void main(String[] args) {
        Shape[] allShapes = new Shape[5];
        allShapes[0] = new Line2D(-2, 3, 4, 6);
        allShapes[1] = new Circle(5.78);
        allShapes[2] = new Rectangle(2, 6);
        allShapes[3] = new Ball(6.34);
        allShapes[4] = new Cube(29.34);

        ShapeCalculator calc = new ShapeCalculator();

        //wersja 1
//        for(int i =0;i<allShapes.length;i++){
//            if (allShapes[i] instanceof Line2D){
//                double result = calc.lineLength((Line2D)allShapes[i]);
//                System.out.println(result);
//            } else if (allShapes[i] instanceof GeometricShape){
//                double result = calc.shapeArea((GeometricShape) allShapes[i]);
//                System.out.println(result);
//            } else if (allShapes[i] instanceof Shape3D){
//                double result = calc.volume((Shape3D)allShapes[i]);
//                System.out.println(result);
//            }
//
//        }

        //wersja 2

        for (int i = 0; i < allShapes.length; i++) {
            if (allShapes[i] instanceof Line2D) {
                double length = calc.lineLength((Line2D) allShapes[i]);
                System.out.println("Odcinek wyznaczony przez współrzędne [" + ((Line2D) allShapes[i]).x1 + ", " + ((Line2D) allShapes[i]).y1 + "] [" + ((Line2D) allShapes[i]).x2 + ", " + ((Line2D) allShapes[i]).y2 + "] ma długość " + length);
            } else if (allShapes[i] instanceof Circle) {
                double area = calc.shapeArea((Circle) allShapes[i]);
                System.out.println("Pole okregu o promieniu " + ((Circle) allShapes[i]).getRadius() + " wynosi " + area);
            } else if (allShapes[i] instanceof Rectangle) {
                double area = calc.shapeArea((Rectangle) allShapes[i]);
                System.out.println("Pole prostokata o bokach " + ((Rectangle) allShapes[i]).getSideA() + " i " + ((Rectangle) allShapes[i]).getSideB() + " wynosi " + area);
            } else if (allShapes[i] instanceof Ball) {
                double volume = calc.volume((Ball) allShapes[i]);
                System.out.println("Kula o długosci promienia " + ((Ball) allShapes[i]).getRadius() + " ma objętosc " + volume);
            } else if (allShapes[i] instanceof Cube) {
                double volume = calc.volume((Cube) allShapes[i]);
                System.out.println("Szescian o dlugosci krawedzi " + ((Cube) allShapes[i]).getSideLength() + " ma objętosc " + volume);
            }

        }

    }
}
