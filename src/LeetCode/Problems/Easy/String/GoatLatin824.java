package LeetCode.Problems.Easy.String;

public class GoatLatin824 {
    public String toGoatLatin(String sentence) {
        String vowel ="aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        StringBuilder a=new StringBuilder();
        for(String word: words){
            a.append("a");
            StringBuilder w = new StringBuilder(word);
            if(vowel.contains(w.charAt(0)+"")){
                w.append("ma");
            }else{
                w.append(w.charAt(0)).append("ma").deleteCharAt(0);
            }
            w.append(a);
            res.append(w).append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        GoatLatin824 g = new GoatLatin824();
        System.out.println(g.toGoatLatin("I speak Goat Latin"));
    }
}
