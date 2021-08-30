package LeetCode.Problems.AugustLeetCodingChallenge2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GraphValidTree261 {
    public static boolean validTree(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> eMap = new HashMap<>();
        HashSet<Integer> node = new HashSet<>();
        for(int[] edge : edges){
            node.add(edge[0]);
            node.add(edge[1]);
        }

        return node.size()==n && n-1==edges.length ;
    }

    public static void main(String[] args) {
        System.out.println(validTree(5, new int[][] {{0,1},{0,2},{0,3},{1,4}}));
        System.out.println(validTree(5, new int[][] {{0,1},{1,2},{2,3},{1,3},{1,4}}));
    }
}
