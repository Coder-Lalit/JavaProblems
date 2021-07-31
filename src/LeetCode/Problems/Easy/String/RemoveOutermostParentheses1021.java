package LeetCode.Problems.Easy.String;

public class RemoveOutermostParentheses1021 {
    public static String removeOuterParentheses(String s) {
        if (s.isEmpty()) return s;
        int x = 0,i=0;
        StringBuilder ans = new StringBuilder();
        for(int c=0;c< s.length();c++){
            x+=s.charAt(c)=='('?1:-1;
            if(x==0){
                ans.append(s.substring(i+1,c));
                i=c+1;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())"));
    }
}
