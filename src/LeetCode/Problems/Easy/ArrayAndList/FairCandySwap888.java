package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class FairCandySwap888 {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int a=0,b=0;
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for(int ax :aliceSizes){
            aList.add(ax);
            a+=ax;
        }
        for(int bx :bobSizes){
            bList.add(bx);
            b+=bx;
        }
        int diff = Math.abs(a-b)/2;
        for(Integer bx : bList){
            if(a>b){
                if(aList.contains(bx+diff)){
                    return new int[]{bx+diff,bx};
                }
            }else{
                if(aList.contains(bx-diff)){
                    return new int[]{bx-diff,bx};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = fairCandySwap(new int[]{1,2,5}, new int[]{2, 4});
        System.out.println(ints[0] +" "+ints[1]);
    }
}
