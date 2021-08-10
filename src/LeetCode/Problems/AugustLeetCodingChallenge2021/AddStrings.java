package LeetCode.Problems.AugustLeetCodingChallenge2021;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int c=1;
        int carry =0;
        StringBuilder ans = new StringBuilder();
        while(c<=num1.length() || c<=num2.length()){
            int x= c<=num1.length() ? num1.charAt(num1.length()-c)-'0':0;
            int y= c<=num2.length() ? num2.charAt(num2.length()-c)-'0':0;
            int z =x+y+carry;
            ans.append(z%10);
            carry=z/10;
            c++;
        }
        if(carry!=0)
            ans.append(carry);
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11123","923"));
    }
}
