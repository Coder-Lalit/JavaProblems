package LeetCode.Problems.Easy.Random;

public class TeemoAttacking495 {

    public static void main(String[] args) {
        //System.out.println(findPoisonedDuration(new int[]{1,4},2));
        System.out.println(findPoisonedDuration(new int[]{1,2,3,4,5},5));
        //System.out.println(findPoisonedDuration(new int[]{1,2},2));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=0;
        for(int i=0,effect=-1;i<timeSeries.length;i++){
            if(effect<timeSeries[i]){
                effect=timeSeries[i]+duration;
                total+=duration;
            }else{
                total+=duration-(effect-timeSeries[i]);
                effect=timeSeries[i]+duration;

            }
        }
        return total;
    }
}
