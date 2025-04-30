public class CircleCaluculator {
    public static double calculateArea(double radius ){
        return (3.1416*radius*radius);
    }
    public static void main(String[] args) {
        
        double circleCaluculator = calculateArea(7);
        System.out.println(circleCaluculator);
    }
}
