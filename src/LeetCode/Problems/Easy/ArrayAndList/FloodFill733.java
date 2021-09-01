package LeetCode.Problems.Easy.ArrayAndList;

public class FloodFill733 {
    int[][] dir = new int[][] {{-1,0},{0,-1},{0,1},{1,0}};
    int oldColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        oldColor = image[sr][sc];
        image[sr][sc]=newColor;
        for(int[] x : dir){
            if(isValid(sr+x[0],sc+x[1],image) && image[sr+x[0]][sc+x[1]]==oldColor){
                floodFill(image,sr+x[0],sc+x[1],newColor);
            }
        }
        return image;
    }

    public static boolean isValid(int v,int h,int [][] img){
        return (v>=0 && v<img.length && h>=0 && h< img[0].length);
    }


    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r-1, c, color, newColor);
            if (c >= 1) dfs(image, r, c-1, color, newColor);
            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
        }
    }




    public static void main(String[] args) {
        FloodFill733 f = new FloodFill733();
        //int[][] newImage = f.floodFill2(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        int[][] newImage = f.floodFill2(new int[][]{{0,0,0}, {0, 1, 1}}, 1, 1, 1);
        for(int [] x: newImage){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
