package LeetCode.Problems.Easy.DesignQuestion;

import java.util.*;

public class DesignHashMap706 {
    public static class MyHashMap{
        public final int BUCKET_SIZE=100;
        List<List<MyEntry>> address;
        public MyHashMap() {
            address=new ArrayList<>();
            for(int i=0;i<BUCKET_SIZE;i++){
                address.add(null);
            }
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int address_index = key % 100;
            if(address.get(address_index)==null){
                address.set(address_index, new LinkedList<MyEntry>(){{add(new MyEntry(key,value));}});
            }else{
                for(MyEntry e : address.get(address_index)){
                    if(e.key==key){
                        e.value=value;
                        return;
                    }
                }
                address.get(address_index).add(new MyEntry(key,value));
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int address_index = key % 100;
            if(address.get(address_index)==null) return -1;
            for(MyEntry e : address.get(address_index)){
                if(e.key==key){
                    return e.value;
                }
            }
            return -1;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int address_index = key % 100;
            if(address.get(address_index)==null) return;
            for(MyEntry e : address.get(address_index)){
                if(e.key==key){
                    address.get(address_index).remove(e);
                }
            }
        }

        public class MyEntry {
            int key;
            int value;
            public MyEntry(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
