package LeetCode.Problems.Easy.Array;

public class SingleRowKeyboard1165 {
    public static int calculateTime(String keyboard, String word) {
        int keys[] = new int [26];
        for(int i=0;i<keyboard.length();i++){
            keys[keyboard.charAt(i)-'a'] = i;
        }

        int last =0;
        int total =0;
        for(char c : word.toCharArray()){
            total+= Math.abs(last-keys[c-'a']);
            last=keys[c-'a'];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculateTime("agcdefbhijklmnopqrstuvwxyz","cba"));
    }
}
