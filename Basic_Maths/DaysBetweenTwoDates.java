public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        System.out.println(daysBetweenDates(date1,date2));
    }

    public static int daysBetweenDates(String date1, String date2) {


        return Math.abs(totalDays(date1) - totalDays(date2));

    }

    public static boolean isLeap(int year){
        return  (year % 400 == 0) || (year%4 == 0 && year%100 != 0);
    }

    public static int totalDays(String date){

        int year = Integer.parseInt(date.substring(0,4)); //better thean Date[0]
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        int[] monthValues = {31,28,31,30,31,30,31,31,30,31,30,31};
        int ans = 0;
        for(int i=1971;i<year;i++){
            if(isLeap(i)){
                ans += 366;
            }
            else{
                ans += 365;
            }

        }

        for(int i = 0;i<month-1;i++){
            ans += monthValues[i];
        }
        if(isLeap(year) && month > 2){
            ans += 1;
        }




        return ans + day;


    }
}
