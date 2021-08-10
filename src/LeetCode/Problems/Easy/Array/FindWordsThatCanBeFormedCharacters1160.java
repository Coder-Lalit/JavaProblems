package LeetCode.Problems.Easy.Array;

public class FindWordsThatCanBeFormedCharacters1160 {
    public static int countCharacters(String[] words, String chars) {
        int cInt []= new int [26];
        for(char c : chars.toCharArray() ){
            cInt[c-'a']++;
        }
        int ans=0;
        for(String s : words){
            int sInt [] = new int[26];
            boolean canBe =true;
            for(char c : s.toCharArray()){
                sInt[c-'a']++;
                if(sInt[c-'a']>cInt[c-'a']){
                    canBe =false;
                    break;
                }
            }
            if(canBe)
                ans+=s.length();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters(new String []{"cat","bt","hat","tree"}, "atach"));
    }
}
