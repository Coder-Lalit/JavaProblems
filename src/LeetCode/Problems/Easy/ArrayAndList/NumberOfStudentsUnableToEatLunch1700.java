package LeetCode.Problems.Easy.ArrayAndList;

public class NumberOfStudentsUnableToEatLunch1700 {
    public static int countStudents(int[] st, int[] sa) {
        int o = 0;
        int z = 0;
        for (int x : st) {
            if(x== 1) o++;
            else z++;
        }
        for(int x: sa){
            if(x==1 && o > 0){
                o--;
            }else if(x==0 && z>0)
                z--;
            else
                break;
        }

        return o+z;

    }

    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }
}
