package LeetCode.Problems.Easy.String;

import java.util.*;
import java.util.stream.Collectors;

public class IndexPairsOfString1065 {
    public static int[][] indexPairs2(String text, String[] words) {
        // We'll add to our list an arr[2], index 0 holds startIndex and index 1 holds endIndex
        List<int[]> list = new ArrayList<>();
        for (String word : words) {
            int index = text.indexOf(word);
            while(index != -1) {
                int startIndex = index;
                int endIndex = index+word.length()-1;
                list.add(new int[]{startIndex, endIndex});
                index = text.indexOf(word, startIndex+1);
            }
        }

        Collections.sort(list, (a,b) -> (a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])));
        int[][] answer = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            answer[i][0] = temp[0];
            answer[i][1] = temp[1];
        }

        return answer;
    }
    public static void main(String[] args) {
        for (int[] y : indexPairs2("thestoryofleetcodeandmestory", new String[]{"story","fleet","leetcode"})) {
            System.out.println(y[0] + "," + y[1]);
        }

//        for (int[] y : indexPairs2("ababa", new String[]{"aba","ab"})) {
//            System.out.println(y[0] + "," + y[1]);
//        }
    }
}
