public class TimeConverter {
    public static int hoursToMinutes(int hours){
        return  hours * 60;

    }
    public static void main(String[] args) {
        //int hoursTwominutes = hoursToMinutes(2);
        //System.err.println(hoursTwominutes);
        System.out.println(TimeConverter.hoursToMinutes(2));
    }
}
