package LeetCode.Problems.Easy.Bits;

public class BinaryGap868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(6));
    }

    public static int binaryGap(int n) {
        int s = 0;
        int gap = 0;
        boolean f = false;
        while (n != 0) {
            if (n % 2 == 1) {
                if (!f) f = true;
                else {
                    s++;
                    gap = gap < s ? s : gap;
                    s=0;
                }
            }else if(n%2==0 && f){
                s++;
            }
            n/=2;
        }
        return gap;
    }
}
