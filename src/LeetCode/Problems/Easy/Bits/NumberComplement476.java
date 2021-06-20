package LeetCode.Problems.Easy.Bits;

public class NumberComplement476 {
    public static void main(String[] args) {
        int num =5;
        int bitmask = num;
        bitmask |= (bitmask >> 1);
        bitmask |= (bitmask >> 2);
        bitmask |= (bitmask >> 4);
        bitmask |= (bitmask >> 8);
        bitmask |= (bitmask >> 16);
        // flip all bits
        System.out.println( bitmask ^ num);
    }
}
