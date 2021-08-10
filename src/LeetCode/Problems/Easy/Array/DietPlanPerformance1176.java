package LeetCode.Problems.Easy.Array;

public class DietPlanPerformance1176 {
    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int sum=0;
        int p=0;
        for (int i = 0; i < calories.length; i++) {
            if(i <k) sum += calories[i];
            else{
                sum+=calories[i]-calories[i-k];
            }
            if(i >=k-1){
                if (sum < lower) p--;
                else if (sum > upper) p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        //System.out.println(dietPlanPerformance(new int[]{1,2,3,4,5},1,3,3));
        //System.out.println(dietPlanPerformance(new int[]{1,2,3,4,5,},3,3,3));
        System.out.println(dietPlanPerformance(new int[]{6, 13, 8, 7, 10, 1, 12, 11}, 6, 5, 37));
    }
}
