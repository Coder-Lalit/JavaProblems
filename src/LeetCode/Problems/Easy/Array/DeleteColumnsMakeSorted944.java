package LeetCode.Problems.Easy.Array;

public class DeleteColumnsMakeSorted944 {
    public static int minDeletionSize(String[] strs) {
        int d=0;
        for(int i=0;i<strs.length-1;i++){
            for(int j=0;j<strs[0].length();j++){
                if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                    d++;
                    break;
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }
}
