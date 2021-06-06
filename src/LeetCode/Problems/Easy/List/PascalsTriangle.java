package LeetCode.Problems.Easy.List;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(10).toString());

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(new ArrayList<>());
        tri.get(0).add(1);
        //System.out.println(tri.get(0).toString());

        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prv = tri.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prv.get(j-1)+prv.get(j));
            }
            row.add(1);
            //System.out.println(row.toString());
            tri.add(row);
        }
        return tri;
    }
}
