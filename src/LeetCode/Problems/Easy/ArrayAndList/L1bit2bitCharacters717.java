package LeetCode.Problems.Easy.ArrayAndList;

public class L1bit2bitCharacters717 {
    public static boolean isOneBitCharacter(int[] bits) {
        int last=-1;
        boolean valid =true;
        for(int i=0;i<bits.length-1;i++){
            if(bits[i]==1 && valid){
                last=1;
                valid=false;
            }
            else if(last==1 && !valid) {
                valid=true;
            }
            else if(valid && bits[i]==0) {
                valid=true;
            }else {
                valid=false;
                break;
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        System.out.println(isOneBitCharacter(new int []{1,1,1,1,0}));
    }
}
