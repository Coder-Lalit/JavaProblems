package LeetCode.Problems.Easy.String;

public class ValidPalindromeII680 {
    int max=1;
    public boolean validPalindrome(String s) {
        int c = 0;
        boolean f = true;
        while (c <= (s.length() - 1 - c)) {
            if (s.charAt(c) != s.charAt(s.length() - 1 - c)) {
                f = false;
                break;
            }
            c++;
        }
        if(!f && max==1){
            max++;
            f = validPalindrome(new StringBuilder(s).deleteCharAt(c).toString()) |
                    validPalindrome(new StringBuilder(s).deleteCharAt(s.length()-1-c).toString());
        }
        return f;
}

    public static void main(String[] args) {
        ValidPalindromeII680 v = new ValidPalindromeII680();
        //System.out.println(v.validPalindrome("abc"));
        //System.out.println(v.validPalindrome("abccba"));
        //System.out.println(v.validPalindrome("abca"));
        //System.out.println(v.validPalindrome("eeccccbebaeeabebccceea"));
        System.out.println(v.validPalindrome("ebcbbececabbacecbbcbe"));
    }
}
