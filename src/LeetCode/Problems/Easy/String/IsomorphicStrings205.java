package LeetCode.Problems.Easy.String;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("babc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> tUnique = new HashSet<>();
        for(int i=0;i<s.length();i++){
            tUnique.add(t.charAt(i));
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }

        if(map.keySet().size()!=tUnique.size())
           return false;
        return true;
    }
}
