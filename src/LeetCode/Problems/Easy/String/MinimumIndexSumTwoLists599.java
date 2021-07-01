package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumTwoLists599 {


    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i=0; i<list1.length;i++) {
            map1.put(list1[i],i);
        }
        for (int j=0;j<list2.length;j++) {
            if(map1.containsKey(list2[j])){
                map2.put(list2[j],map1.get(list2[j])+j);
            }
        }
        int min = Collections.min(map2.values());
        List<String> a= new ArrayList<>();
        for(String s: map2.keySet()){
            if(map2.get(s)==min)
                a.add(s);
        }

        return a.toArray(new String[a.size()]);
    }

}
