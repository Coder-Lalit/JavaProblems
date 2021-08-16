package LeetCode.Problems.Easy.Random;

public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        String [] dayName = new String []{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int daysInMonth [] = new int []{0,31,59,90,120,151,181,212,243,273,304,334,365};
        int days=4;
        if(year>=1971 && year <=2100){

            for(int i =1971;i<year;i++){
                days+=365;
                if(i % 400 == 0 || (i % 100 !=0 && i % 4==0)) days++;
            }
            days+=daysInMonth[month-1]+day;
            if(month>2 && (year % 400 == 0 || (year % 100 !=0 && year % 4==0))) days++;
        }
        return dayName[days%7];
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(1,1,1971));
        System.out.println(dayOfTheWeek(14,8,2021));
        System.out.println(dayOfTheWeek(29,2,2016));
    }
}
