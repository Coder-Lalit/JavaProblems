package LeetCode.Challenges.Y2021.August;

public class FlipStringMonotoneIncreasing {
    public static int minFlipsMonoIncr(String s) {
        int cz = 0;
        int co = 0;
        int i=s.indexOf("1");
        if(i==-1)
            i=0;
        for (;i<s.length();i++) {
            if (s.charAt(i) == '0') {
                cz++;
            } else {
                co++;
            }
        }
        return Math.min(cz, co);
    }

    public static int minFlip(String s){
        int i=s.indexOf("1");
        if(i==-1)
            i=0;
        int cz=0;
        int co=0;

        for(;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0')
                cz++;
            else
                co++;
            if(cz>co)
                cz=co;
        }
        System.out.println(cz);
        return cz;
    }

    public static void main(String[] args) {
        System.out.println(minFlip("0101100011"));
        System.out.println(minFlip("00110"));
        System.out.println(minFlip("10011111110010111011"));
        System.out.println(minFlipsMonoIncr("10011111110010111011"));

    }
}
