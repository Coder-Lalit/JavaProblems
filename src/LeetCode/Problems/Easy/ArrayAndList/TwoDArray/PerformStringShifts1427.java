package LeetCode.Problems.Easy.ArrayAndList.TwoDArray;

public class PerformStringShifts1427 {
    public static String stringShift(String s, int[][] shift) {
        int l = 0;
        int r = 0;
        for (int[] sh : shift) {
            if (sh[0] == 0) {
                l += sh[1];
            } else r += sh[1];
        }

        StringBuilder ans = new StringBuilder(s);
        int n =s.length();
        if (l == r) return s;
        else if (l > r) {

//            String sh = s.substring(0, (l - r) % n);
//            return ans.delete(0, (l - r) % n).append(sh).toString();
            return (s+s).substring((l - r) % n,(l - r) % n+n);

        }
        else {
//            String sh = s.substring(n-((r-l) % n));
//            return  sh+ans.delete(n-((r-l) % n),n).toString();
           return  (s+s).substring(n-((r-l) % n),n-((r-l) % n)+n);
        }
    }

    public static void main(String[] args) {
        System.out.println(stringShift("abc",new int[][]{{0,1},{1,2}}));
        System.out.println(stringShift("abcdefg",new int[][]{{1,1},{1,1},{0,2},{1,3}}));
    }
}
