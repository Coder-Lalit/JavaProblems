package LeetCode.Problem.Easy;

public class ProblemLongestPalindrome {

    public static void main(String[] args) {
        String [] inputs ={"ababa","ccc","c","ccaaba","ataba","ataba","babad","cbbd"};

        for(String s: inputs ){
            System.out.println(String.format("Longest palindrome in %s is %s ",s,longestPalindrome(s)));
        }
    }

    public static String longestPalindrome(String s) {
        int max=0;
        String logSubString="";
        if(s=="" || s.length()==1){
            return s;
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int doubleCharacterPalindrome = expandAroundCenter(s,i-1,i+2);
                if(doubleCharacterPalindrome > max){
                    max=doubleCharacterPalindrome;
                    logSubString = s.substring(i-(doubleCharacterPalindrome/2)+1,i+doubleCharacterPalindrome/2+1);
                }
            }
            int singleCharacterPalindrome = expandAroundCenter(s,i-1,i+1);
            if(singleCharacterPalindrome > max){
                max=singleCharacterPalindrome;
                logSubString = s.substring(i-(singleCharacterPalindrome/2),i+singleCharacterPalindrome/2+1);
            }


        }

        return logSubString;
    }

    public static int expandAroundCenter(String s,int l,int r) {
        while (l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                r++;
                l--;
            }
            else{
                break;
            }
        }
        return r-l-1;
    }
}
