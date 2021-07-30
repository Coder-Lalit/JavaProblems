package LeetCode.Problems.Easy;

public class PartitionArrayIntoThreePartsWithEqualSum1013 {
    public static boolean canThreePartsEqualSum(int[] arr) {

        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }

        double x = arr[arr.length-1]/3;
        if(x%1!=0){
            return false;
        }

        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==x){
                int j=i+1;
                while(j<arr.length-1){
                    if(arr[j]-x==x && arr[arr.length-1]-arr[j]==x){
                        return true;
                    }
                    j++;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1}));
    }
}
