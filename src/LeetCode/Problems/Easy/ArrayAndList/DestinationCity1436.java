package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCity1436 {
    public static String destCity(List<List<String>> paths) {
        HashSet<String> out = new HashSet<>();
        HashSet<String> noOut  = new HashSet<>();

        for(List<String> p : paths){
            out.add(p.get(0));
            if(!out.contains(p.get(1))){
                if(!noOut.contains(p.get(1))) noOut.add(p.get(1));
                else noOut.remove(p.get(1));
            }
            if(noOut.contains(p.get(0))){
                noOut.remove(p.get(0));
            }

        }


        return noOut.iterator().next();
    }

    public static void main(String[] args) {
        List<List<String>> dest = new ArrayList<>();
        dest.add(new ArrayList<String>(){{add("A");add("B");}});
        dest.add(new ArrayList<String>(){{add("B");add("C");}});
        dest.add(new ArrayList<String>(){{add("C");add("D");}});
        System.out.println(destCity(dest));
    }
}
