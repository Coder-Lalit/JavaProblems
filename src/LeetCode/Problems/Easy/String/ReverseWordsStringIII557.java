package LeetCode.Problems.Easy.String;

public class ReverseWordsStringIII557 {
    public String reverseWords(String s) {
        s.trim();
        if(!s.contains(" "))
            return new StringBuilder(s).reverse().toString();
        StringBuilder s1 = new StringBuilder();
        String[] s2 = s.split(" ");
        for(String x: s2){
            s1.append(new StringBuilder(x).reverse());
        }
        return s1.toString();
    }
}
