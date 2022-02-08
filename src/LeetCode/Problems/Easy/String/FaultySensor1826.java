package LeetCode.Problems.Easy.String;

public class FaultySensor1826 {
    public static void main(String[] args) {
        System.out.println(
                badSensor(new int[]{2,3,4,5},new int[]{2,1,3,4})
                //badSensor(new int[]{2,2,2,2,2},new int[]{2,2,2,2,5})
        );
    }
    public static int badSensor(int[] s1, int[] s2) {
        int i = 0, sz = s1.length;
        while(i < sz && s1[i] == s2[i])
            ++i;
        while(i + 1 < sz && s1[i] == s2[i + 1] && s1[i + 1] == s2[i])
            ++i;
        return i >= sz - 1 ? -1 : s1[i] == s2[i + 1] ? 1 : 2;
    }
}
