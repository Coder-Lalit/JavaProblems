package LeetCode.Problems.Easy.ArrayAndList;

public class Shift2DGrid1260 {

    //NotSolved
    public static void shiftGrid(int[][] grid, int k) {
        int x = k % grid[0].length;
        int y = k / grid.length;
        int z = k % grid.length;

        int c[] = new int[grid[0].length];
        int r[] = new int[grid.length];
        int ans[][] = new int[grid.length][grid[0].length];

        System.out.println("==============================");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.print((i + x) % grid[0].length + " ");
            c[(i + x) % grid[0].length] = i;
        }
        System.out.println("");
        for (int i = 0; i < grid.length; i++) {
            System.out.print((i + y) % grid.length + " ");
            r[(i + y) % grid.length] = i;
        }
        System.out.println("\n==============================");


        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = grid[r[i]][c[j]];
            }
        }
        print(ans);


        System.out.println("==============================");
        for (int i = 0; i < grid.length; i++) {
            System.out.print((i + y + z) % grid.length + " ");
            r[(i + y + z) % grid.length] = i;
        }
        System.out.println("\n==============================");

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < z && j < grid[0].length; j++) {
                ans[i][j] = grid[r[i]][c[j]];
            }
        }
        print(ans);

    }

    public static void main(String[] args) {
        //shiftGrid(new int[][]{{1, 11, 111, 1111}, {2, 22, 222, 2222}, {3, 33, 333, 3333}, {4, 44, 444, 4444}}, 4);
        //shiftGrid(new int[][]{{1, 11, 111, 1111}, {2, 22, 222, 2222}, {3, 33, 333, 3333}, {4, 44, 444, 4444}}, 6);
        shiftGrid(new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23);
        //shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}},1);
    }

    static void print(int ans[][]) {
        System.out.println("=============================");
        for (int[] a : ans) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");
    }
}
