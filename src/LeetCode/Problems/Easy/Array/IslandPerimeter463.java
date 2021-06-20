package LeetCode.Problems.Easy.Array;

public class IslandPerimeter463 {
    public static void main(String[] args) {
        IslandPerimeter463 i = new IslandPerimeter463();
        System.out.println(i.islandPerimeter(new int [][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        for(int i =0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    sum+=helper(grid,i,j);
                }

            }
        }
        return sum;
    }

    public int helper(int[][] g, int i, int j){
        int sum=0;
        if(g.length==i+1 || g[i+1][j]!=1)
            sum++;
        if( i-1<0 || g[i-1][j]!=1)
            sum++;
        if(g[i].length==j+1|| g[i][j+1]!=1)
            sum++;
        if(j-1<0 || g[i][j-1]!=1)
            sum++;
        return sum;
    }
}
