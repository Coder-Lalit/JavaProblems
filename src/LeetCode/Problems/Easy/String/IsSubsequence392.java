package LeetCode.Problems.Easy.String;

public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        //System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int lInd = -1;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("last Idex :"+lInd);
            System.out.println("Loking for :"+s.charAt(i));
            System.out.println("New String :"+t.substring(lInd + 1));

             int x=t.substring(lInd+1).indexOf(s.charAt(i));
            System.out.println("x :"+x);
            if (x == -1) {
                return false;
            }else{
                lInd +=x+1;
            }

        }
        return true;
    }
}
