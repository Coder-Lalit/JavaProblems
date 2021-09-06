package LeetCode.Challenges.Y2021.September;

import java.util.*;

public class ErectTheFence587 {
    public static int[][] outerTrees(int[][] trees) {
        Arrays.sort(trees, (a,b)-> {
            if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        HashMap<Integer,List<int[]>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int [] x : trees){
            min = Math.min(min,x[0]);
            max = Math.max(max,x[0]);
            if(!map.containsKey(x[0])){
                map.put(x[0],new ArrayList<>());
            }
            map.get(x[0]).add(x);
        }

        Collections.sort(new ArrayList<Integer>(map.keySet()));


        List<int[]> ansList = new ArrayList<>();
        ansList.addAll(map.get(min));
        ansList.addAll(map.get(max));







//        int prvI =-1;
//        int prvJ = -1;
//
//        List<int[]> ansList = new ArrayList<>();
//
//        for(int [] x : trees ){
//            if(prvI ==-1){
//                ansList.add(x);
//            }else{
//                if(x[0]<prvI){
//                    ansList.add(x);
//                }
//                while()
//            }
//            prvI = x[0];
//            prvJ = x[1];
//        }

        return trees;
    }


    public static void main(String[] args) {
        int [][] trees = new int[][]{{1,1},{2,2},{4,2},{2,0},{2,4},{3,3}};
        for(int [] x : outerTrees(trees)){
            System.out.print("["+x[0]+","+x[1]+"]");
        }
    }
}
