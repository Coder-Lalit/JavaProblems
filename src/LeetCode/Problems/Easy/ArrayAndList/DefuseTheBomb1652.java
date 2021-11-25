package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class DefuseTheBomb1652 {

    public static int[] decrypt(int[] code, int k) {

        int ans [] = new int [code.length];
        for(int i =0;i<code.length;i++){
            int c;
            int s=0;
            if(k >0){
                c=1;
                while(c<=k){
                    s+=c+i<code.length ? code[c+i] : code[c+i-code.length];
                    c++;
                }
                ans[i]=s;
            }else if(k <0){
                c=-1;
                while(c>=k){
                    s+=i+c>=0 ? code[i+c]: code[code.length+(i+c)];
                    c--;
                }
                ans[i]=s;
            }
            else{
                ans[i]=0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{5,7,1,4},3)));
        System.out.println(Arrays.toString(decrypt(new int[]{2,4,9,3},-2)));
    }

}
