package LeetCode.Problems.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class DesignALeaderboard1244 {
    private HashMap<Integer,Integer> map;
    public DesignALeaderboard1244() {
        map= new HashMap<>();
    }

    public void addScore(int playerId, int score) {
        map.put(playerId,map.getOrDefault(playerId,0)+score);
    }

    public int top(int K) {
        int sum=0;
        List<Integer> collect = map.values().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //Arrays.sort();
        for(int i=0;i<=K;i++){
            //sum+=map.values().get(i);
        }
        return sum;
    }

    public void reset(int playerId) {
        map.remove(playerId);
    }
}
