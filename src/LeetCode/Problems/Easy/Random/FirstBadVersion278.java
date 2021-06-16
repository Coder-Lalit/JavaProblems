package LeetCode.Problems.Easy.Random;

public class FirstBadVersion278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753));
    }

    public static int firstBadVersion(int n) {
        int l=1;
        int r=n;
        int m=(l+r)/2;
        while (l<r){
            System.out.println(l+" "+r+" "+m);
            if(!isBadVersion(m)){
                l=m+1;
            }
            else{
                r=m;
            }
            m=(l+r)/2;
        }
        return l;
    }

    private static boolean isBadVersion(int m) {
        return m>=17027;
    }
}
