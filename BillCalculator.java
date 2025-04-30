public class BillCalculator {
     public static double calculateTotalWithTax(double amount, double taxPercent){
        return amount + (amount * taxPercent / 100);

     }
     public static void main(String[] args) {
        double calculateTotalWithTaxresult = calculateTotalWithTax(1000, 18);
        System.err.println(calculateTotalWithTaxresult);
        //System.out.println(BillCalculator.calculateTotalWithTax(1000, 18));
     }
}
