package LeetCode.Problems.Easy.Random;

import java.util.HashMap;

public class LemonadeChange860 {
    public static void main(String[] args) {

    }

    public static boolean lemonadeChange(int[] bills) {
        int fiveC=0;
        int tenC=0;

        for(int b: bills){
            if(b==5){
                fiveC++;
            }
            if(b==10){
                if(fiveC>0){
                    fiveC--;
                    tenC++;
                }else {
                    return false;
                }
            }else if(b==20){
                if(tenC>0 && fiveC>0){
                    fiveC--;
                    tenC--;
                }else if(fiveC>3){
                    fiveC-=3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
