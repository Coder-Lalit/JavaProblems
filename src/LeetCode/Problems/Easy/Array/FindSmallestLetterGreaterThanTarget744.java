package LeetCode.Problems.Easy.Array;

public class FindSmallestLetterGreaterThanTarget744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int r = letters.length;
        int l =0;
        while(l<r ){
            int m = l+(r-l)/2;
            if(letters[m]<= target){
                l=m+1;
            }else{
                r=m;
            }
        }
        //System.out.println(m);
        return letters[l % letters.length];
    }

    public static void main(String[] args) {
        //System.out.println(nextGreatestLetter(new char[]{'c','c','d','d','f','j'},'c'));
        //System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'c'));
        //System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'a'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'j'));
    }
}
