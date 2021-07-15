package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount811 {
    HashMap<String,Integer> subMap = new HashMap<>();
    public List<String> subdomainVisits(String[] cpdomains) {
        for(String d : cpdomains){
            helper(d);
        }
        List<String> res = new ArrayList<>();
        subMap.entrySet().forEach(m->{
            StringBuilder s = new StringBuilder();
            res.add(s.append(m.getValue()).append(" ").append(m.getKey()).toString());
        });
        return res;
    }

    void helper(String input){
        int count = Integer.parseInt(input.split(" ")[0]);
        String[] domain = input.split(" ")[1].split("\\.");
        String s = "";
        for(int i= domain.length-1;i>=0;i--){
            s= s.equals("")? domain[i]:domain[i]+"."+s;
            subMap.put(s,subMap.getOrDefault(s,0)+count);
        }

    }

    public static void main(String[] args) {
        SubdomainVisitCount811 s = new SubdomainVisitCount811();
        List<String> strings = s.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        List<String> string2 = s.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        //System.out.println(strings.toString());
        System.out.println(string2.toString());
    }
}
