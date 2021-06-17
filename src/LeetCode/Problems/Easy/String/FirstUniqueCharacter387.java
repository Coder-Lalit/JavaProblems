package LeetCode.Problems.Easy.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstUniqueCharacter387 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar1("aabbc"));
    }

    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        Set<Character> chars = map.keySet();
        int ind = -1;
        for (Character c : chars) {
            if (map.get(c) == 1) {
                System.out.println(c);
                ind = s.indexOf(c);
                break;
            }
        }
        return ind;
    }

    public static int firstUniqChar1(String s) {
        int ind=-1;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.deleteCharAt(i);
            if(sb.indexOf(s.charAt(i)+"")==-1){
                ind =i;
                break;
            }
            sb.insert(i,s.charAt(i));

        }
        return ind;
    }
}
