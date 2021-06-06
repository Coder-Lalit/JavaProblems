package LeetCode.Problems.Easy.String;

public class ImplementStrStr {
    public static void main(String[] args) {
        //System.out.println(strStr2("xaaa", "aa"));
        System.out.println(strStr("mississippi","issip"));
        System.out.println(strStr2("mississippi","issip"));
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)
                    && i + needle.length()-1 < haystack.length()) {
                index = i;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        index = -1;
                        break;
                    }
                    if (j == needle.length() - 1) {
                        index = i;
                    }
                }
            }
            if (index != -1) {
                break;
            }
        }
        return index;
    }

    public static int strStr2(String haystack, String needle) {
        int index = -1;
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)
                    && i + needle.length()-1 < haystack.length()) {
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    index=i;
                    break;
                }
            }
            if (index != -1) {
                break;
            }
        }
        return index;
    }
}
