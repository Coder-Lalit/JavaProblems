package LeetCode.Problems.Easy.Random;

public class RotatedDigits788 {
    boolean [] valid = new boolean []{true,true,true,false,false,true,true,false,true,true};
    char [] rep = new char [] {'0','1','5','3','4','2','9','7','8','6'};
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(isValid(i)) {
                System.out.println(i);
                c++;
            }
        }
        return c;
    }

    boolean isValid(int n){
        StringBuilder temp = new StringBuilder(Integer.toString(n));
        for(int i=0; i<temp.length();i++){
            if(valid[temp.charAt(i)-'0']){
                temp.setCharAt(i,rep[temp.charAt(i)-'0']);
            }else{
                return false;
            }
        }
        return !temp.toString().equals(Integer.toString(n));
    }

    public static void main(String[] args) {
        RotatedDigits788 r = new RotatedDigits788();
        //r.rotatedDigits(857);
        r.isValid(23);
    }
}
