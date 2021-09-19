package LeetCode.Problems.Easy.String;

public class ReplaceAllQuestionMarkToAvoidConsecutiveRepeatingCharacters1576 {
    public static String modifyString(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '?') return "a";
            else return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int i = sb.indexOf("?");

        while (i != -1) {
            if (i == 0) {
                sb.setCharAt(i,getChar(' ',sb.charAt(i+1)));
            } else if (i == sb.length() - 1) {
                sb.setCharAt(i,getChar(' ',sb.charAt(i-1)));
            } else {
                sb.setCharAt(i,getChar(sb.charAt(i-1),sb.charAt(i+1)));
            }

            i = sb.indexOf("?", i + 1);
        }
        return sb.toString();
    }

    static char getChar(char ch1, char ch2) {
        boolean chs[] = new boolean[3];
        if (ch1-'a'<3) chs[ch1-'a'] = true;
        if (ch1-'a'<3) chs[ch2-'a'] = true;
        for(int i=0;i<26;i++){
            if(chs[i]==false) return (char) (i+'a');
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(modifyString("??"));
        System.out.println(modifyString("?????"));
        System.out.println(modifyString("?a?"));
    }
}
