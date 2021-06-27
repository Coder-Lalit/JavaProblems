package LeetCode.Problems.Easy.String;

public class ReverseStringII541 {
    public static void main(String[] args) {
        ReverseStringII541 r = new ReverseStringII541();
        System.out.println(r.reverseStr("abcdefg",2));
    }
    public String reverseStr(String s, int k) {
        StringBuilder s1 = new StringBuilder();
        if(s.length()<k){
            return new StringBuilder(s).reverse().toString();
        }

        for(int i=0;i<s.length();i++){
            if(i%(2*k)==0){
                if(i+k< s.length()){
                    s1.append(new StringBuilder(s.substring(i,i+k)).reverse());
                }else{
                    s1.append(new StringBuilder(s.substring(i)).reverse());
                }

                i=i+k-1;
            }else{
                if(i+k<s.length()){
                    s1.append(new StringBuilder(s.substring(i,i+k)));
                }else{
                    s1.append(new StringBuilder(s.substring(i)));
                }
                i=i+k-1;
            }
        }

        return s1.toString();
    }

}
