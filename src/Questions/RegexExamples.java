package Questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[]args) {
        Pattern p = Pattern.compile("\\d+");
        //Matcher m = p.matcher("string123more456string789");
        Matcher m = p.matcher("adbacaa1");
        Integer temp=0;
        while(m.find()) {
            System.out.println(m.group());
            temp = temp+Integer.valueOf(m.group());
        }
        System.out.println(temp);
    }
}