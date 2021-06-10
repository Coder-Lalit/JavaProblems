package LeetCode.Problems.Easy.DataStrutureDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class TwoSum {
    private HashMap<Integer,Integer> hashMap = new HashMap<>();
    /** Initialize your data structure here. */
    public TwoSum() {

    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(hashMap.containsKey(number)){
            hashMap.put(number,hashMap.get(number)+1);
        }
        else {
            hashMap.put(number,1);
        }
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Integer i : hashMap.keySet()) {
            if ((value - i == i) ) {
                if(hashMap.get(i) !=null && hashMap.get(i)==2){
                    return true;
                }
            } else {
                if (hashMap.containsKey(value - i)) {
                    return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum a = new TwoSum();
        a.add(0);
        a.add(-1);
        a.add(-1);
        a.add(0);
        System.out.println(a.find(-2));
        //System.out.println(a.find(0));
        //System.out.println(a.find(-1));
        //System.out.println(a.find(1));
    }
}
