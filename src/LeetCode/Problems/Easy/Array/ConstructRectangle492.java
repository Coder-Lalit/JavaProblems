package LeetCode.Problems.Easy.Array;

public class ConstructRectangle492 {
    public static void main(String[] args) {
        for (int i : constructRectangle(122122)){
            System.out.print(i+" ");
        }

    }
    public static int[] constructRectangle(int area) {
        if(area==1){
            return new int []{1,1};
        }
        int l = area;
        int w =1;
        int c=2;
        boolean flag=true;
        while(flag){
            if(area%c==0){
                if(area/c >= c){
                    if(l-w > (area/c)-c){
                        l= area/c;
                        w=c;
                    }
                }else {
                    flag=false;
                }
            }
            c++;
        }
        return new int[]{l,w};
    }
}
