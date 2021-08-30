package LeetCode.Problems.Easy.Random;

import java.util.Arrays;

public class CountLargestGroup1399 {
    public static int countLargestGroup(int n) {
        int count [] = new int[37];
        for(int i =1;i<=n;i++){
            int temp=i, sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp /=10;
            }
            count[sum]++;
        }

        Arrays.sort(count);
        int ans=1;
        int max = count[count.length-1];
        for(int x= count.length-2; x>=0; x--){
            if(max==count[x]) ans++;
            else break;
        }

        return ans;

    }

    public static void main(String[] args) {
        countLargestGroup(13);
    }
}
