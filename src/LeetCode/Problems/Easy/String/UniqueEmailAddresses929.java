package LeetCode.Problems.Easy.String;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {
    public static int numUniqueEmails(String[] emails) {
        Set<String> e = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] p = emails[i].split("@");
            if (p.length == 2 && p[0].charAt(0) != '+') {
                e.add(p[0].replace(".", "").split("\\+")[0] + "@" + p[1]);
            }
        }
        System.out.println(e);
        return e.size();
    }


    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
        //System.out.println(numUniqueEmails2(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}));
    }
}
