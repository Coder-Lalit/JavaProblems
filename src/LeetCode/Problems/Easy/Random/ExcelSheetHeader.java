package LeetCode.Problems.Easy.Random;

public class ExcelSheetHeader {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + "   " + convertToTitle(i));
        }

        System.out.println(convertToTitle(702));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        int rem;
        while (columnNumber != 0) {
            rem = columnNumber % 26;
            //columnNumber = columnNumber / 26;
            if(rem==0){
                rem+=26;
                columnNumber-=26;
            }
            columnNumber = columnNumber / 26;
            res.append((char) (rem + 64));
        }
        return res.reverse().toString();
    }

    public static String convertToTitle2(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber != 0) {
            res.append((char) (columnNumber % 26 + 64));
            columnNumber = columnNumber / 26;
        }
        return res.reverse().toString();
    }
}
