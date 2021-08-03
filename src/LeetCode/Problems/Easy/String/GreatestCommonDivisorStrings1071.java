package LeetCode.Problems.Easy.String;

public class GreatestCommonDivisorStrings1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if(str1.length()>str2.length()) return gcdOfStrings(str2,str1);

        for(int i= str1.length(); i>0;i--){
            if(divides(str1.substring(0,i),str1)){
                if(divides(str1.substring(0,i),str2)){
                    return str1.substring(0,i);
                }
            }

        }
        return "";
    }

    static boolean divides(String a, String b){
        if((b.length()) % (a.length())==0){
            int c=0;
            int i=0;
            while(c<b.length()){
                if(b.charAt(c)!=a.charAt(i)){
                    return false;
                }
                c++;
                i++;
                if(i==a.length())
                    i=0;
            }
            return true;
        }
        return false;
    }

    public static String gcdOfStrings2(String str1, String str2) {
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2,str1);
        }else if(!str1.startsWith(str2)){
            return "";
        }else if(str2.length() == 0){
            return str1;
        }else{
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings2("ABCABCABCABC","ABCABC"));
    }
}
