package LeetCode.Problems.Easy.String;

public class CountSubstringsWithOnlyOneDistinctLetter1180 {
    public static int countLetters(String s) {
        int subC=0;
        for(int i=0; i<s.length();){
            int st = i;
            while(i<s.length() && s.charAt(i)==s.charAt(st)) i++;
            subC+= (i-st)*(i-st+1)/2;
        }
        return subC;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("aaaba"));
    }
}
