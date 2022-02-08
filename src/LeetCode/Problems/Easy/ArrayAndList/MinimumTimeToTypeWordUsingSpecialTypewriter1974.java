package LeetCode.Problems.Easy.ArrayAndList;

public class MinimumTimeToTypeWordUsingSpecialTypewriter1974 {
    public static void main(String[] args) {
        //System.out.println(minTimeToType("bza"));
        String x="1";
        System.out.println(x.charAt(0)-'0');
    }
    public static int minTimeToType(String word) {
        char ch ='a';
        int x=0;
        for(int i=0; i< word.length();i++){
            if(word.charAt(i)>ch){
                x+= Math.min(word.charAt(i)-ch,(26-(word.charAt(i)-'a')+(ch-'a')));
            }else{
                x+= Math.min(ch-word.charAt(i),(26-(ch-'a')+(word.charAt(i)-'a')));
            }
            ch=word.charAt(i);
            x++;
        }
        return x;
    }
}
