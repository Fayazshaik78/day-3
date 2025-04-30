public class TemperatureConverter{
    public static double ConvertToFahrenheit(double celsius){
       return (celsius * 9/5)+32; 
    }
    public static void main(String[] args) {
      System.out.println(TemperatureConverter.ConvertToFahrenheit(25));
      //double ConvertToFahrenheitresult = ConvertToFahrenheit(25);
      //System.out.println(ConvertToFahrenheitresult);
    }

}