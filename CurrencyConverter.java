public class CurrencyConverter {
    
    public static double rupeesToUSD(double rupess){
        return (rupess/83.0);
    }
    public static void main(String[] args) {
        double rupessToUSDresult = rupeesToUSD(8300);
        System.out.println(rupessToUSDresult);
    }
    
}
