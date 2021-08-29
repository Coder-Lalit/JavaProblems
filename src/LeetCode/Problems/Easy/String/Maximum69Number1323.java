package LeetCode.Problems.Easy.String;

public class Maximum69Number1323 {
    public int maximum69Number (int num) {
        StringBuilder n = new StringBuilder(String.valueOf(num));
        for(int i=0; i<n.length();i++){
            if(n.charAt(i)=='6'){
                n.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(n.toString());
    }
}
