package LeetCode.Problems.Easy.ArrayAndList;

import org.testng.util.Strings;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream1656 {

    private String [] strings;
    public OrderedStream1656(int n) {
        strings = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        strings[idKey]=value;
        List<String> ans = new ArrayList<>();
        for(int i=1; i<strings.length;i++){
            if(!strings[i-1].equals("")){
                ans.add(strings[i-1]);
            }else {
                break;
            }
        }
        return ans;
    }
}
