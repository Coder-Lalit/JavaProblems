package LeetCode.Problems.Easy.ArrayAndList;

public class ShortestWordDistance243 {
    public static void main(String[] args) {
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
        "coding",
        "practice"));
    }
    public static int shortestDistance(String[] words, String word1, String word2) {
        int min=Integer.MAX_VALUE;
        int s=-1,e=-1;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                s=i;
                if(e!=-1){
                    min=min<Math.abs(s-e)?min:Math.abs(s-e);
                    e=-1;
                }
            }
            else if(words[i].equals(word2)){
                e=i;
                if(s!=-1){
                    min=min<Math.abs(s-e)?min:Math.abs(s-e);
                    s=-1;
                }
            }
        }
        return min;
    }
}
