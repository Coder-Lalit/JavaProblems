package LeetCode.Problems.AugustLeetCodingChallenge2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveBoxes546 {
    public static int removeBoxes(int[] boxes) {
        int ans = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> boxList = new ArrayList<>();
        for(int i=0; i<boxes.length;i++){
            map.put(boxes[i],map.getOrDefault(boxes[i],new ArrayList<>()));
            map.get(boxes[i]).add(i);
            boxList.add(boxes[i]);
        }
        map.keySet().stream().forEach(k-> System.out.println(k+" --> "+map.get(k)));
        System.out.println("==========================");

        for(int x: map.keySet()){
            if(isContinuous(map.get(x))){
                for(int y: map.get(x)) boxList.remove(y);
                ans += map.get(x).size() *map.get(x).size();
            }
        }
        int [] tempBoxes= new int [boxList.size()];
        for(int j=0;j<boxList.size();j++){
            tempBoxes[j]=boxList.get(j);
        }
        return boxList.size()==0?ans:ans+removeBoxes(tempBoxes);
    }

    public static void main(String[] args) {
        removeBoxes(new int[]{1,3,2,2,2,3,4,3,1});
    }

    static boolean isContinuous(List<Integer> ints){
        for(int i=1; i< ints.size();i++){
            if(ints.get(i)-ints.get(i-1)!=1) return false;
        }
        return true;
    }

}
