package Questions;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateEntry {
    public static void main(String[] args) {
        int num [] = {1,2,2,3,4,5,6,4,5};
        duplicate(num);
        removeDuplicate(num);
    }

    public static void duplicate(int num[]){
        HashMap<Integer,Integer> hashMapNum = new HashMap<Integer,Integer>();

        for(int i=0;i< num.length;i++ ){
            if(hashMapNum.containsKey(num[i])){
                hashMapNum.put(num[i],hashMapNum.get(num[i])+1);
            }
            else {
                hashMapNum.put(num[i],1);
            }
        }
        List<Map.Entry<Integer, Integer>> collect = hashMapNum.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());

        System.out.println(collect.toString());

    }

    public static void removeDuplicate(int num []){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0;i<num.length;i++){
            arrayList.add(num[i]);
        }

        set.addAll(arrayList);
        System.out.println(set);

    }
}
