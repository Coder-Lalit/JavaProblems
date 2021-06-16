package LeetCode.Problems.Easy.Random;

import java.util.HashMap;

public class WordPattern290 {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        if (pattern.length() != s.split(" ").length) {
            return false;
        }
        String[] sArray = s.split(" ");

        HashMap<Character, String> cSMap = new HashMap<>();
        HashMap<String, Character> sCMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (cSMap.containsKey(pattern.charAt(i)) && !cSMap.get(pattern.charAt(i)).equals(sArray[i])) {
                return false;
            } else {
                cSMap.put(pattern.charAt(i), sArray[i]);
            }

            if (sCMap.containsKey(sArray[i]) && !sCMap.get(sArray[i]).equals(pattern.charAt(i))) {
                return false;
            } else {
                sCMap.put(sArray[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
