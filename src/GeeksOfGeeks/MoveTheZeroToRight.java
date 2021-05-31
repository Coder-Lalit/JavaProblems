package GeeksOfGeeks;

public class MoveTheZeroToRight {
    public static void main(String[] args) {
        moveTheZeroToRight(new int []{1, 2, 0, 4, 3});
        //moveTheZeroToRight(new int []{1, 2, 0, 4, 3, 0, 5, 0});
        //moveTheZeroToRight(new int []{1, 2, 0, 0, 0, 3, 6});
    }
    public static void moveTheZeroToRight(int [] arr){
        int counter =0;
        int end =arr.length-1;
        while (counter<end){
            if(arr[counter]==0){
                arr[counter]=arr[counter+1];
                arr[counter+1]=0;
            }
            counter++;
        }
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
