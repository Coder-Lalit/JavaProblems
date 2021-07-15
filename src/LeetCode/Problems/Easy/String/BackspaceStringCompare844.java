package LeetCode.Problems.Easy.String;

public class BackspaceStringCompare844 {
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }

    static String getString(String s){
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)=='#'){
                s1.deleteCharAt(i);
                i--;
                if(i>=0){
                    s1.deleteCharAt(i);
                    i--;

                }
            }

        }
        return s1.toString();
    }

    public static void main(String[] args) {
        System.out.println(getString("ab##").equals(getString("c#d#")));
    }
}
