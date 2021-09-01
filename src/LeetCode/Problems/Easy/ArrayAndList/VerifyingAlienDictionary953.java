package LeetCode.Problems.Easy.ArrayAndList;

public class VerifyingAlienDictionary953 {
    public static boolean isAlienSorted(String[] words, String order) {
        int o [] = new int[26];
        for(int i=0;i<order.length();i++){
            o[order.charAt(i)-'a'] = i;
        }

        for(int i=0;i<words.length-1;i++){
            if(!compare(words[i],words[i+1],o)){
                return false;
            }
        }
        return true;
    }
    public static boolean compare(String o1, String o2,int [] o) {
        int len1 = o1.length();
        int len2 = o2.length();
        int lim = Math.min(len1, len2);

        int k = 0;
        while (k < lim) {
            if (o[o1.charAt(k)-'a'] != o[o2.charAt(k)-'a']) {
                if(o[o1.charAt(k)-'a'] > o[o2.charAt(k)-'a']){
                    return false;
                }else{
                    return true;
                }
            }
            k++;
        }
        if(len1 > len2) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[]{"helloq","hello"},"hlabcdefgijkmnopqrstuvwxyz"));
    }
}
