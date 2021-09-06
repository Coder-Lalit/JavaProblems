package LeetCode.Challenges.Y2021.August;

public class LongestUncommonSubsequenceII522 {
    public static int findLUSlength(String[] strs) {
        int maxLen = -1;
        for(int i=0; i<strs.length;i++){
            boolean uncommon =true;
            for(int j=0;j<strs.length && uncommon;j++){
                if(!isUnCommon(strs[i],strs[j]) && j!=i) uncommon=false;
            }
            if(uncommon) maxLen=Math.max(maxLen,strs[i].length());
        }
        return maxLen;
    }

    static boolean isUnCommon(String a , String b){
        if(a.length()==b.length() && a.equals(b)){
            return false;
        }
        if(a.length()>b.length()) return true;
        int i=0;
        int index=0;
        while(i<a.length()){
            index = b.indexOf(a.charAt(i),index);
            if(index !=-1) i++;
            else break;
            index++;
        }
        return i!=a.length();
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength(new String[]{"aba","cdc","eae"}));
        System.out.println(findLUSlength(new String[]{"aaa","aaa","aa"}));
        System.out.println(findLUSlength(new String[]{"aabbcc", "aabbcc","cb"}));
        System.out.println(findLUSlength(new String[]{"aabbcc", "aabbcc","c","e","aabbcd"}));
    }
}
