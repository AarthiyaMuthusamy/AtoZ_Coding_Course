public class DayOfWeek {
    public static void main(String[] args) {
        int year = 2019;
        int month = 8;
        int day = 31;
        System.out.println(dayOfTheWeek(year,month,day));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] monthValues = {31,28,31,30,31,30,31,31,30,31,30,31};

        int totalDays = day;

        for(int i = 1971;i<year;i++){
            if(isLeap(i))
                totalDays += 366;

            else
                totalDays += 365;

        }

        for(int i = 0;i<month-1;i++){
            totalDays += monthValues[i];
        }

        if(isLeap(year) && month > 2){
            totalDays++;
        }

        int index = (totalDays + 4) % 7;
        return week[index];

    }
    public static boolean isLeap(int year){
        return  (year % 400 == 0) || (year%4 == 0 && year%100 != 0);
    }
}
