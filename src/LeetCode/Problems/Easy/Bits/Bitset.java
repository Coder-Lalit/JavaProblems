package LeetCode.Problems.Easy.Bits;

import java.util.Arrays;

public class Bitset {
    boolean[] bits;
    int zeroCount;
    boolean flip = false;
    int size=0;

    public Bitset(int size) {
        bits = new boolean[size];
        Arrays.fill(bits, false);
        zeroCount = size;
        this.size=size;
    }

    public void flip() {
        if (flip) flip = false;
        else flip = true;
        zeroCount=size-zeroCount;
    }

    public void fix(int idx) {
        if (flip) {
            if(bits[idx]){
                bits[idx]=false;
                zeroCount++;
            }
        }
        else {
            if(!bits[idx]) {
                bits[idx] = true;
                zeroCount--;
            }
        }
    }

    public void unfix(int idx) {
        if (flip) {
            if(!bits[idx]){
                bits[idx]=true;
                zeroCount--;
            }
        }
        else {
            if(bits[idx]) {
                bits[idx] = false;
                zeroCount++;
            }
        }
    }

    public boolean all() {
        return flip ? zeroCount == size : zeroCount == 0;
    }

    public boolean one() {
        return flip ? zeroCount > 1 : zeroCount != size;
    }

    public int count() {
        return size-zeroCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean b : bits) {
            if (b) {
                if (flip) sb.append(0);
                else sb.append(1);
            } else {
                {
                    if (flip) sb.append(1);
                    else sb.append(0);
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String op[] = new String[]{"Bitset","all","fix","flip","fix","flip","unfix","one","all","toString","flip","fix","all","flip","fix","flip","unfix","fix","all","flip","all"};
        int op1[] = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Bitset bitset=null;
        for (int i = 0; i < op.length; i++) {
            System.out.println(i+"==="+op[i]);
            switch (op[i]) {
                case "Bitset":
                    bitset = new Bitset(op1[i]);
                    bitset.toString();
                    break;
                case "fix":
                    bitset.fix(op1[i]);
                    bitset.toString();
                    break;
                case "flip":
                    bitset.flip();
                    bitset.toString();
                    break;
                case "unfix":
                    bitset.unfix(op1[i]);
                    bitset.toString();
                    break;
                case "one":
                    System.out.println(bitset.one());
                    break;
                case "all":
                    System.out.println(bitset.all());
                    break;
                case "count":
                    System.out.println(bitset.count());
                    break;

            }
        }
    }
}
