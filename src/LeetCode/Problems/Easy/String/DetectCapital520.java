package LeetCode.Problems.Easy.String;

public class DetectCapital520 {
    public static void main(String[] args) {
        DetectCapital520 d = new DetectCapital520();
        System.out.println(d.detectCapitalUse("USA"));
        System.out.println(d.detectCapitalUse("Lalit"));
        System.out.println(d.detectCapitalUse("lalit"));
        System.out.println(d.detectCapitalUse("DaS"));
        System.out.println(d.detectCapitalUse("lalIt"));
    }

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if(chars[0]>=65 && chars[0]<=90){
            if(chars.length>1){
                if(chars[1]>=65 && chars[1]<=90){
                    for(int i=2;i<chars.length;i++){
                        if(chars[i]>=97 && chars[i]<=122){
                            return false;
                        }
                    }
                }else{
                    for(int i=2;i<chars.length;i++){
                        if(chars[i]>=65 && chars[i]<=90){
                            return false;
                        }
                    }
                }
            }else
                return true;
        }
        else{
            for(char c : chars){
                if(c>=65 && c<=90){
                    return false;
                }
            }
        }
        return true;
    }
}
