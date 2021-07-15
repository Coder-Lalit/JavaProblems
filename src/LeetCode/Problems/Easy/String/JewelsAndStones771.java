package LeetCode.Problems.Easy.String;

public class JewelsAndStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        boolean  small []= new boolean[26];
        boolean  cap []= new boolean[26];
        for(char c : jewels.toCharArray()){
            if(c>='a' && c<= 'z'){
                small[c-'a']=true;
            }else{
                cap[c-'A']=true;
            }
        }

        int res =0;
        for(char c : stones.toCharArray()){
            if(c>='a' && small[c-'a']){
                res++;
            }else if(c<='Z' && cap[c-'A']){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        JewelsAndStones771 j = new JewelsAndStones771();
        j.numJewelsInStones("aA","aAAbbbb");
    }
}
