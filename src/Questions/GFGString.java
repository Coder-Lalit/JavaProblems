package Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFGString {
    public static void main(String[] args) {
        String search = "gfg";
        Pattern pattern = Pattern.compile("gfg");

        Scanner sc = new Scanner(System.in);
        String [] strings = new String[sc.nextInt()];
        sc.nextLine();
        for(int i=0;i<strings.length;i++){
            strings[i]= sc.nextLine();
        }

        for(int k=0; k<strings.length;k++){
            int count =0;
//            String a = strings[k];
//            for(int l=0;l<a.length();l++){
//                if(a.charAt(l)==search.charAt(0)){
//                    if(l+3 < a.length() && a.substring(l,l+3).equals("gfg")){
//                        count++;
//                        l=l+3;
//                    }
//                }
//            }
            Matcher matcher = pattern.matcher(strings[k]);
            matcher.find();
            System.out.println(count>0?count:-1);
        }
    }
}
