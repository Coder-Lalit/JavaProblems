package LeetCode.Problems.Easy.Array;

public class MinimumTimeVisitingAllPoints1266 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] x1 = points[i];
            int[] x2 = points[i + 1];
            int deltaX = Math.abs(x1[0] - x2[0]);
            int deltaY = Math.abs(x1[1] - x2[1]);

            time += deltaX >= deltaY ? deltaX : deltaY;
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
        System.out.println(minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}}));
    }
}
