package LeetCode.Problems.Easy.String;

public class ReverseOnlyLetters917 {
    public static String reverseOnlyLetters(String s) {
        int st =0;
        int ed =s.length()-1;
        StringBuilder s1 = new StringBuilder(s);
        while(st < ed){
            if(!Character.isAlphabetic(s1.charAt(st)))
                st++;
            if(!Character.isAlphabetic(s1.charAt(ed)))
                ed--;
            if(Character.isAlphabetic(s1.charAt(st)) && Character.isAlphabetic(s1.charAt(ed))){
                char temp = s1.charAt(st);
                s1.setCharAt(st,s1.charAt(ed));
                s1.setCharAt(ed,temp);
                st++;
                ed--;
            }

        }
        return s1.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
