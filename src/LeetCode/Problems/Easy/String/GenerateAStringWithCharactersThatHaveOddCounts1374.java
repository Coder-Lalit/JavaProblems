package LeetCode.Problems.Easy.String;

import java.util.Arrays;

public class GenerateAStringWithCharactersThatHaveOddCounts1374 {
    public static String generateTheString(int n) {
        char [] res = new char [n];
        Arrays.fill(res,'a');

        if(n % 2 ==0){
            res[n-1]='b';
        }else if(n>2){
            res[n-1]='c';
            res[n-2]='b';
        }

        return new String(res);
    }

    public static void main(String[] args) {
        for(int i=1; i<15;i++){
            System.out.println(generateTheString(i));
        }
    }
}
