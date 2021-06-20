package LeetCode.Problems.Easy.String;

public class LicenseKeyFormatting482 {

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting2("5F3Z-2e-9-w",4));
        System.out.println(licenseKeyFormatting2("2-4A0r7-4k",4));
        System.out.println(licenseKeyFormatting2("2-5g-3-j",2));
        System.out.println(licenseKeyFormatting2("A-A-A-A",1));
    }
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder s1 = new StringBuilder();
        for(int i=s.length()-1,c=0;i>=0;i--){
            if(c%k==0 && s1.length()>0 && c!=0){
                s1.append("-");
                c=0;
            }
            if(s.charAt(i)!='-'){
                s1.append(s.charAt(i));
                c++;
            }
        }
        if(s1.length()>1 && s1.charAt(s1.length()-1)=='-'){
            s1.deleteCharAt(s1.length()-1);
        }
        return s1.reverse().toString().toUpperCase();
    }
    public static String licenseKeyFormatting2(String s, int k) {
        StringBuilder s1 = new StringBuilder(s.toUpperCase());
        for(int i=s1.length()-1,c=0;i>=0;i--){
            if(s1.charAt(i)=='-'){
                s1.deleteCharAt(i);
                i--;
            }else if(c%k==0 && c!=0){
                s1.insert(i+1,"-");
                c=-1;
                i++;
            }
            c++;
        }
        return s1.toString();
    }
}
