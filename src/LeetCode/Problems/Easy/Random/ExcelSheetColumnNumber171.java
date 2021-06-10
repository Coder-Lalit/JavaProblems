package LeetCode.Problems.Easy.Random;

public class ExcelSheetColumnNumber171 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AZ"));
    }

    public static int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            res+= Math.pow(26,i)*((int)columnTitle.charAt(columnTitle.length()-1-i)-64);
        }
        return res;
    }
}
