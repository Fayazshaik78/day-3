public class ShapeCalculator {
    public static double calculatePerimeter(double length, double width){
        return  2 * (length + width);


    }
public static void main(String[] args) {
    //double calculatePerimeterresult = calculatePerimeter(5.0, 3.0);
   // System.out.println(calculatePerimeterresult);
    System.out.println(ShapeCalculator.calculatePerimeter(5.0, 3.0));
}
}
