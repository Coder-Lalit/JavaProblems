package LeetCode.Problems.Easy.String;

public class ValidWordAbbreviation408 {

    public static void main(String[] args) {
        //System.out.println(validWordAbbreviation("internationalization","i12iz4n"));
        System.out.println(validWordAbbreviation("ai", "02"));
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        String digit = "";
        int d = 0;
        int s = 0;
        int i = 0;
        if (abbr.length() > word.length()) return false;
        while (i < abbr.length()) {
            if (Character.isDigit(abbr.charAt(i))) {
                if (digit == "" && abbr.charAt(i) == '0')
                    return false;
                else {
                    digit += abbr.charAt(i);
                    s++;
                }
            } else {
                d += Integer.valueOf(digit);
                if (i + d - s > word.length() - 1)
                    return false;
                if (abbr.charAt(i) != word.charAt(i + d - s)) {
                    return false;
                }
                digit = "";
            }
            i++;
        }

        if (digit != "") {
            d += Integer.valueOf(digit);

        }
        return d + i - s == word.length();
    }
}

