package LeetCode.Problems.Easy.String;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toUpperCase();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                temp.append(s.charAt(i));
        }
        return temp.toString().equals(temp.reverse().toString());
    }
}
