package LeetCode.Problems.Easy.ArrayAndList;

public class ValidMountainArray941 {
    public static boolean validMountainArray(int[] arr) {

        if(arr.length<3) return false;
        if(arr[0]>=arr[1]) return false;
        if(arr[arr.length-2]<=arr[arr.length-1]) return false;
        boolean flag = false;
        for(int i=2;i<arr.length-1;i++){

            if(arr[i]<arr[i-1] && !flag){
                flag =true;
            }else if(arr[i]>arr[i-1] && flag){
                return false;
            }else if(arr[i]== arr[i-1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
    }
}
