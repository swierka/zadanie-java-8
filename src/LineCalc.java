public class LineCalc {

    double lineLength(Line2D line){
    double sumofPowers = Math.pow((line.getX2()-line.getX1()),2) + Math.pow((line.getY2()-line.getY1()),2);
    double result = Math.sqrt(sumofPowers);
    return result;
    }
}
