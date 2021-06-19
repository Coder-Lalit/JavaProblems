package LeetCode.Problems.Easy.String;

public class NumberSegmentsString434 {
    public static void main(String[] args) {
       String s = "Hello,  my name is John";
        String[] s1 = s.split(" ");
        int count =0;
        for(String s2 : s1){
            if(!s2.equals("")) count++;
        }
        System.out.println(count);

        boolean ch=false;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ch=true;
            }else{
                if(ch){
                    ch=false;
                    c++;
                }
            }
        }
        c=ch?c+1:c;
        System.out.println(c);
    }
}
