package LeetCode.Problems.Easy.Random;

public class DistributeCandiesPeople1103 {
    public static int[] distributeCandies(int candies, int num_people) {
        int [] ans = new int [num_people];
        int c=0;
        int cc=1;
        while(candies!=0){
            if(candies-cc <0){
                ans[c]=ans[c]+candies;
                break;
            }else{
                ans[c]=ans[c]+cc;
            }
            c++;
            if(c==num_people){
                c=0;
            }
            candies-=cc;
            cc++;
        }

        return ans;

    }

    public static void main(String[] args) {
        for(int i : distributeCandies(7,4)){
            System.out.print(i+" ");
        }
    }
}
