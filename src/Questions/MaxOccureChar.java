package Questions;

import java.util.HashMap;
import java.util.Set;

public class MaxOccureChar {
    public static void main(String[] args) {
        maxOccureChar("aaabbbaacc");
    }



    public static void maxOccureChar(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        HashMap<Character, Integer> charWithCount = new HashMap<>();
        char[] charArray = input.toCharArray();
        int max = 0;
        for (char ch : charArray) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        Set<Character> characterSet = charCountMap.keySet();


        Integer maxtemp =0;
        char output = 0;
        for (char ch : characterSet) {
            if(maxtemp < charCountMap.get(ch)){
                output=ch;
                maxtemp = charCountMap.get(ch);
            }
        }
        System.out.println("max occured character is '" + output +"' occured for " +maxtemp +" times");
    }
}

