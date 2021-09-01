package LeetCode.Problems.Easy.ArrayAndList;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0, 0}, 3, new int[]{2, 3, 4, 5}, 4);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=nums1.length-1; i>=0;i--){
            if(m>0 && n>0){
                if(nums1[m-1] > nums2[n-1]){
                    nums1[i]=nums1[m-1];
                    m--;
                }
                else{
                   nums1[i]=nums2[n-1];
                   n--;
                }
            }else if(m==0){
                nums1[i]=nums2[n-1];
                n--;
            }
            else{
                nums1[i]=nums1[m-1];
                m--;
            }
        }

        for (int x = 0; x < nums1.length; x++) {
            System.out.println(nums1[x]);
        }
    }
}
