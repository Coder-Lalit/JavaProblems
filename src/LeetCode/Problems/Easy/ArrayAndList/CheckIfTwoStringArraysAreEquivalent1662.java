package LeetCode.Problems.Easy.ArrayAndList;

public class CheckIfTwoStringArraysAreEquivalent1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        for(String s : word1){
            sb1.append(s);
        }

        int st=0;
        for(String s : word2){
            if(sb1.indexOf(s,st)==st){
                st+=s.length();
            }
            else {
                return false;
            }
        }
        return st==sb1.length();
    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String []{"ab", "c"},new String[]{"a", "bc"}));
    }
}
