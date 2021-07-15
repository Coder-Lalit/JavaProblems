package LeetCode.Problems.Easy.Array;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostCommonWord819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Pattern re = Pattern.compile("(?<=\\s|^)[a-zA-Z]*(?=[.,;:]?\\s|$)");
        List<String> bList = new ArrayList<>();
        for(String b : banned){
            bList.add(b);
        }
        HashMap<String,Integer> map = new HashMap<>();
        Matcher m = re.matcher(paragraph);
        while (m.find()){
            for( int groupIdx = 0; groupIdx <= m.groupCount(); groupIdx++ ){
                System.out.println( "[" + groupIdx + "] = " + m.group(groupIdx));
                if(!bList.contains(m.group(groupIdx))){
                    map.put(m.group(groupIdx),map.getOrDefault(m.group(groupIdx),0)+1);
                }
            }
        }
        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

    public static void main(String[] args) {
        MostCommonWord819 m = new MostCommonWord819();
        m.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"});
    }
}
