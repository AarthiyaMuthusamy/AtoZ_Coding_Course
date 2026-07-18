public class DayOfYear {
    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println(dayOfYear(date));

    }

    public static int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        int[] monthValues = {31,28,31,30,31,30,31,31,30,31,30,31};

        int ansDay = day;
        for(int i = 0;i<month-1;i++){
            ansDay += monthValues[i];
        }
        if(isLeap(year) && month > 2){
            ansDay += 1;
        }


        return ansDay;


    }

    public static boolean isLeap(int year){
        return  ((year % 400 == 0) || (year%4 == 0) && (year%100 != 0));
    }
}
