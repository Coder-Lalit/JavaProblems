package LeetCode.Problems.Easy.Array.Search;

public class BinarySearch704 {

    public static int search(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;
        boolean found =false;
        int m=0;
        while (l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
                found=true;
                break;
            }
            if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return found? m:-1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int []{-1,0,3,5,9,12},9));
        System.out.println(search(new int []{-1,0,3,5,9,12},2));
        System.out.println(search(new int []{5},5));
    }
}
