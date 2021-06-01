package LeetCode.Problems.Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s){
        if(s==" "){
            return 0;
        }
        else{
            s=s.trim();
            for(int i=s.length()-1;i>=0;i--){
                char ch = s.charAt(i);
                if(ch==' '){
                    return s.length()-i-1;
                }
                if(i==0){
                    return s.length();
                }
            }
        }
        return 0;
    }
}
