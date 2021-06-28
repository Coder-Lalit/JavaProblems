package LeetCode.Problems.Easy.Random;

import java.util.HashSet;

public class DistributeCandies575 {
    public static void main(String[] args) {

    }
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> candi= new HashSet<>();
        for(int i : candyType){
            candi.add(i);
        }

        if(candyType.length/2>candi.size()-1){
            return candi.size()-1;
        }else{
            return candyType.length/2;
        }

    }
}
