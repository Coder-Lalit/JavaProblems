package GeeksOfGeeks;

public class Pair {
        //Input  :  arr[] = {1, 5, 7, -1},
        //          sum = 6
        //Output :  2
        //Pairs with sum 6 are (1, 5) and (7, -1)
        //Input  :  arr[] = {1, 5, 7, -1, 5},
        //          sum = 6
        //Output :  3
        //Pairs with sum 6 are (1, 5), (7, -1) &
        //                     (1, 5)
        //Input  :  arr[] = {1, 1, 1, 1},
        //          sum = 2
        //Output :  6
        //There are 3! pairs with sum 2.
        //Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6,
        //                   5, 4, 2, 1, 1, 1},
        //          sum = 11
        //Output :  9
    public static void main(String[] args) {
        System.out.println(findPair(new int[]{1, 5, 7, -1},6));
        System.out.println("Answer is 2");
        System.out.println(findPair(new int[]{1, 5, 7, -1, 5},6));
        System.out.println("Answer is 3");
        System.out.println(findPair(new int[]{1, 1, 1, 1},2));
        System.out.println("Answer is 6");
        System.out.println(findPair(new int[]{10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1},11));
        System.out.println("Answer is 9");
        System.out.println(findPair(new int[]{5, -5, 1, -40, 20, 6, 8, 7, 10},15));
        System.out.println("Answer is 0");
    }

    public static int findPair(int a [], int sum){
        int count=0;
        int start =0;
        int rem = sum-a[0];
        for (int i=1;i<a.length;i++){
            if(rem==a[i]){
                count++;
                System.out.println("got pair :"+a[start]+","+a[i]);
            }
            if(i==a.length-1 && start != a.length-2){
                i=start+1;
                start++;
                rem=sum-a[i];
            }
        }

        return count;
    }

}
