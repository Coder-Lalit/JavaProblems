package LeetCode.Problems.Easy.DesignQuestion;

import java.util.LinkedList;
import java.util.List;

public class HashSet705 {
    public static class MyHashSet{
        public static int BUCKET_SIZE=100;
        List<List<Integer>> address;
        public MyHashSet() {
            for(int i=0;i<BUCKET_SIZE;i++){
                address.add(null);
            }
        }

        public void add(int key) {
            int address_index = key % BUCKET_SIZE;
            if(address.get(address_index)==null){
                address.set(address_index,new LinkedList<Integer>(){{add(key);}});
            }else{
                if(!address.get(address_index).contains(Integer.valueOf(key))){
                    address.get(address_index).add(key);
                }
            }
        }

        public void remove(int key) {
            int address_index = key % BUCKET_SIZE;
            if(address.get(address_index).contains(Integer.valueOf(key))){
                address.get(address_index).remove(Integer.valueOf(key));
            }
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int address_index = key % BUCKET_SIZE;
            return address.get(address_index).contains(Integer.valueOf(key));
        }
    }
}
