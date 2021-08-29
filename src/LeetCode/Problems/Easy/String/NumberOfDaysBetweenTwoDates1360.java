package LeetCode.Problems.Easy.String;

public class NumberOfDaysBetweenTwoDates1360 {
    public static int daysBetweenDates(String date1, String date2) {
//        Input: date1 = "2020-01-15", date2 = "2019-12-31"
        String[] d1Split = date1.split("-");
        String[] d2Split = date2.split("-");

        int year1 = Integer.parseInt(d1Split[0]);
        int mon1 = Integer.parseInt(d1Split[1]);
        int day1 = Integer.parseInt(d1Split[2]);

        int year2 = Integer.parseInt(d2Split[0]);
        int mon2 = Integer.parseInt(d2Split[1]);
        int day2 = Integer.parseInt(d2Split[2]);


        if (year1 > year2 || (year1 == year2 && mon1 > mon2) || (year1 == year2 && mon1 == mon2 && day1 > day2)) {
            return daysBetweenDates(date2, date1);
        }


        int daysPerMonth[] = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int totalDays = 0;

        totalDays -= daysPerMonth[mon1 - 1];

        if (mon1 > 2) {
            if ((year1 % 400 == 0) || (year1 % 4 == 0 && year1 % 100 != 0)) {
                totalDays--;
            }
        }
        totalDays -= Integer.parseInt(d1Split[2]);


        for (int i = year1; i < year2; i++) {
            totalDays += 365;
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
                totalDays++;
            }
        }

        totalDays += daysPerMonth[mon2 - 1];

        if (mon2 > 2) {
            if ((year2 % 400 == 0) || (year2 % 4 == 0 && year2 % 100 != 0)) {
                totalDays++;
            }
        }
        totalDays += day2;


        return totalDays;
    }

    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2019-12-31", "2020-01-15"));
    }
}
