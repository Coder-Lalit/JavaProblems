package LeetCode.Challenges.Y2021.August;

import java.util.HashMap;

public class MinimumWindowSubstring76 {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char ch : t.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int r = 0;
        String desired = "";
        HashMap<Character, Integer> mapS = new HashMap<>();
        while (r < s.length()) {
            if (mapT.containsKey(s.charAt(r))) mapS.put(s.charAt(r), mapS.getOrDefault(s.charAt(r), 0) + 1);
            if (isDesired(mapS, mapT)) {
                if (desired.isEmpty()) {
                    desired = s.substring(l, r + 1);
                } else {
                    desired = desired.length() > s.substring(l, r + 1).length() ? s.substring(l, r + 1) : desired;
                }
                if (mapT.containsKey(s.charAt(l))) mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
                l++;
                while (l <= r && isDesired(mapS, mapT)) {
                    desired = desired.length() > s.substring(l, r + 1).length() ? s.substring(l, r + 1) : desired;
                    if (mapT.containsKey(s.charAt(l))) mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
                    l++;
                }
            }
            r++;
        }
        return desired;
    }

    static boolean isDesired(HashMap<Character, Integer> mapS, HashMap<Character, Integer> mapT) {
        if (mapS.keySet().size() != mapT.keySet().size()) return false;
        for (Character ch : mapT.keySet()) {
            if (mapT.get(ch) > mapS.get(ch)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("adobecodebanc", "abc"));
        System.out.println(minWindow("aa", "aaa"));
        System.out.println(minWindow("ab", "b"));
    }
}
