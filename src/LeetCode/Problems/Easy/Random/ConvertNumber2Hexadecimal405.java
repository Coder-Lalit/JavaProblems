package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

public class ConvertNumber2Hexadecimal405 {
    public static void main(String[] args) {
        //System.out.println(toHex(26));
        for(int i=-100;i<=100;i++){
            System.out.println(i+" hexa value "+toHex(i)+"----"+Integer.toHexString(i));
        }

    }

    public static String toHex(int num) {

        String res = "";

        // check if num is 0 and directly return "0"
        if (num == 0) {
            return "0";
        }
        // if num>0, use normal technique as
        // discussed in other post
        if (num > 0) {
            while (num != 0) {
                res = getHexa(num % 16) + res;
                num /= 16;
            }
        }
        // if num<0, we need to use the elaborated
        // trick above, lets see this
        else {
            // store num in a u_int, size of u_it is greater,
            // it will be positive since msb is 0
            int n = num;

            // use the same remainder technique.
            while (n != 0) {
                res = getHexa(n % 16) + res;
                n /= 16;
            }
        }

        return res;
    }
    public static String getHexa(int x){
        if(x<10)
            return String.valueOf(x);
        else{
            return (char)(96+x%9)+"";
        }
    }
}
