package LeetCode.Problems.Easy.Array;

public class ImageSmoother661 {
    public static void main(String[] args) {
        //imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        imageSmoother(new int[][]{{100,200,100},{200,50,200},{100,200,100}});
    }

    public static int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        int [] vD = new int[]{-1,0,1};
        int [] hD = new int[]{-1,0,1};
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum=0;
                int c=0;
                for(int v : vD){
                    for (int h : hD){
                        if(fine(v+i,j+h,img)){
                            sum+=img[v+i][h+j];
                            c++;
                        }
                    }
                }
                res[i][j] = (int) Math.floor(sum / c);
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
        return res;
    }
    public static boolean fine(int v,int h,int[][] img){
        return v>=0 && v<img.length && h>=0 && h<img[0].length;
    }
}
