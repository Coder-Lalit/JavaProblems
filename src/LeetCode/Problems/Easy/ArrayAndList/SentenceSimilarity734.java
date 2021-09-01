package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SentenceSimilarity734 {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length!=sentence2.length) return false;
        HashMap<String,List<String>> di = new HashMap<>();
        for(List<String> x : similarPairs){
            if(di.containsKey(x.get(0))){
                di.get(x.get(0)).add(x.get(1));
            }else{
                di.put(x.get(0),new ArrayList<String>(){{add(x.get(1));}});
            }

            if(di.containsKey(x.get(1))){
                di.get(x.get(1)).add(x.get(0));
            }else{
                di.put(x.get(1),new ArrayList<String>(){{add(x.get(0));}});
            }
        }

        for(int i=0;i<sentence1.length;i++){
            boolean flag = true;
            if(!sentence1[i].equals(sentence2[i])){
                if(di.get(sentence1[i])==null || !di.get(sentence1[i]).contains(sentence2[i])){
                    if(di.get(sentence2[i])==null || !di.get(sentence2[i]).contains(sentence1[i])){
                        flag=false;
                    }
                }
            }


            if(!flag){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        SentenceSimilarity734 s = new SentenceSimilarity734();
        List<List<String>> similarPairs = new ArrayList<>();
        similarPairs.add(new ArrayList<String>(){{add("great");add("fine");}});
        similarPairs.add(new ArrayList<String>(){{add("drama");add("acting");}});
        similarPairs.add(new ArrayList<String>(){{add("skills");add("talent");}});
        //System.out.println( s.areSentencesSimilar(new String[]{"great","acting","skills"},new String[]{"fine","drama","talent"},similarPairs));
        System.out.println( s.areSentencesSimilar(new String[]{"great"},new String[]{"great"},new ArrayList<>()));
    }
}
