package Questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class palindrom {
    public static void main(String[] args) {
        char [] input ={'m','m','a','d','a','a','d','a'};

        HashMap<Character,Integer> cIHashMap = new HashMap<>();

        for(int i=0;i<input.length;i++){
            if(cIHashMap.containsKey(input[i])){
                cIHashMap.put(input[i],cIHashMap.get(input[i])+1);
            }
            else {
                cIHashMap.put(input[i],1);
            }
        }

        List<Map.Entry<Character, Integer>> collect =
                cIHashMap.entrySet().stream().filter(e -> e.getValue()%2 !=0).collect(Collectors.toList());

        if(collect.size()<=1 ){
            System.out.println("it can be palindrom");
        }
        else {
            System.out.println("Palindrom not Possible");
        }
    }
}