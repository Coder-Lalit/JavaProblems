package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PathCrossing1496 {
    public static boolean isPathCrossing(String path) {
        HashMap<Integer, List<Integer>> cMap = new HashMap<>();
        int x=0;
        int y=0;
        cMap.put(0,new ArrayList<Integer>(){{add(0);}});
        for(char ch : path.toCharArray()){
            if(ch=='N') y++;
            else if (ch=='S') y--;
            else if(ch == 'E') x++;
            else x--;

            if(!cMap.containsKey(x)){
                cMap.put(x,new ArrayList<>());
                cMap.get(x).add(y);
            }else if(!cMap.get(x).contains(y)) {
                cMap.get(x).add(y);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
    }
}
