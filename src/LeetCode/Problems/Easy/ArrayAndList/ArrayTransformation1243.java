package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class ArrayTransformation1243 {
    public static List<Integer> transformArray(int[] arr) {
        arr=helper(arr);
        List<Integer> ans = new ArrayList<>();
        for(int x:arr){
            ans.add(x);
        }
        return ans;
    }

    static int[] helper(int [] arr){
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
        boolean isChanged=false;
        int temp [] = new int[arr.length];
        temp[0]=arr[0];
        temp[arr.length-1]=arr[arr.length-1];
        do{
            isChanged=false;
            for(int i =1; i<arr.length-1;i++){
                if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                    temp[i]=arr[i]+1;
                    isChanged = true;
                }
                else if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    temp[i]=arr[i]-1;
                    isChanged = true;
                }
                else temp[i]=arr[i];
            }
            arr=temp.clone();
            for (int x:arr) System.out.print(x+" ");
            System.out.println();
        }while (isChanged);
        return arr;
    }

    public static void main(String[] args) {
        //System.out.println(transformArray(new int[]{1,6,3,4,3,5}));
        System.out.println(transformArray(new int[]{1,5,4,7,9,2,5,1,2,5,8,8,3,8,4,4,6,3}));
    }
}
