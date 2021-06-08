package LeetCode.Problems.Easy.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        System.out.println(generate(10).toString());
        //[1, 9, 36, 84, 126, 126, 84, 36, 9, 1]

    }
    public static List<Integer> generate(int numRows) {
        List<Integer> prv = new ArrayList<Integer>(){{add(1);}};
        if(numRows==1){
            return prv;
        }

        for(int i=1;i<numRows+1;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prv.get(j-1)+prv.get(j));
            }
            row.add(1);
            //System.out.println(row.toString());
            prv = row;
        }
        return prv;
    }
}
