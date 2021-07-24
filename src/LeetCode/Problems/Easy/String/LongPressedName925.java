package LeetCode.Problems.Easy.String;

public class LongPressedName925 {
    public static boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)) return true;
        int j=0;
        int i=1;
        while(i<name.length() || j<typed.length()){
            int n =1;
            while(i<name.length()){
                if(name.charAt(i)==name.charAt(i-1)) n++;
                else break;
                i++;
            }
            int t=0;
            while(j<typed.length()){
                if(name.charAt(i)==typed.charAt(j)) t++;
                else break;
                j++;
            }
            if(t<n) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex",
                "aaleex"));
    }
}
