package LeetCode.Problems.Easy.ArrayAndList;

public class ReplaceElementsWithGreatestElementOnRightSide1299 {

    public static int[] replaceElements(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1] < arr[j]){
                arr[j-1] = arr[j];
                if(j==i) arr[j]=-1;
                j--;
            }
        }
        return arr;
    }

    public static int[] replaceElements2(int[] arr) {
        int rightMax = -1;
        int newMax =0;
        for(int i =arr.length-1; i>-1;i--)
        {
            newMax = Math.max(rightMax, arr[i]);
            arr[i]=rightMax;
            rightMax= newMax;
        }
        return arr;
    }

    public static void main(String[] args) {
        for(int i : replaceElements2(new int [] {17,18,5,4,6,1})){
            System.out.print(i+" ");
        }
    }
}
