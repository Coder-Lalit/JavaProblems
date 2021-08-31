package LeetCode.Problems.Easy.String;

public class MaximumScoreAfterSplittingAString1422 {
    public int maxScore(String s) {
        int one=0;
        int zero=0;
        for(char ch : s.toCharArray()){
            if(ch=='1') one++;
        }
        int max =Integer.MIN_VALUE;
        for(char ch : s.toCharArray()){
            if(ch=='1') one--;
            else zero++;
            max= Math.max(max,zero+one);
        }
        return max;
    }

    public int maxScore1(String s) {
        int one=s.replaceAll("0","").length()-1;
        int zero=0;
        int max =Integer.MIN_VALUE;
        for(char ch : s.toCharArray()){
            if(ch=='1') one--;
            else zero++;
            max= Math.max(max,zero+one);
        }
        return max;
    }
}
