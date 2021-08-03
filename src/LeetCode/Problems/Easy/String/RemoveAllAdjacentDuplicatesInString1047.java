package LeetCode.Problems.Easy.String;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        int c=0;
        while(c<sb.length()-1){
            if(sb.charAt(c)==sb.charAt(c+1)){
                sb.delete(c,c+2);
                c = c!=0? c-1: 0;
                continue;
            }
            c++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbacaa"));
    }
}
