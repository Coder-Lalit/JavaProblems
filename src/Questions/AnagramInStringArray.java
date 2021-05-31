package Questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramInStringArray {
    public static void main(String[] args) {
        getAnagramInStringArray(new String[]{"god","cat","fan","dog","tac","dgo"});
    }
    public static void getAnagramInStringArray(String arr[]){
        HashMap<String,Integer> anagramMap = new HashMap<>();
        for (String a: arr) {
            char []x=a.toCharArray();
            int temp=0;
            for(char y:x){
                //System.out.println(y+" --> "+(int)y);
                temp+=y;
            }
            //System.out.println(a+" --> "+temp);
            anagramMap.put(a,temp);
        }

        Map<Integer, List<String>> k1 = anagramMap.keySet().stream().collect(Collectors.groupingBy(k -> anagramMap.get(k)));
        List<Map.Entry<Integer, List<String>>> collect = k1.entrySet().stream().filter(k -> k.getValue().size() > 1).collect(Collectors.toList());
        collect.stream().forEach(c->{
            System.out.println(c.getValue());
        });

    }
}
