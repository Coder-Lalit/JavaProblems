package LeetCode.Problems.Easy.String;

public class NumberLinesToWriteString806 {
    public int[] numberOfLines(int[] w, String s) {
        int l=1;
        int i=0;
        int oW=0;
        while(i<s.length()){
            oW+=w[s.charAt(i)-'a'];
            if(oW<=100){
                i++;
            }else{
                l++;
                oW=0;
            }
        }

        return new int []{l,oW};

    }

    public static void main(String[] args) {
        NumberLinesToWriteString806 n = new NumberLinesToWriteString806();
        int[] ints = n.numberOfLines(new int []{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
        "abcdefghijklmnopqrstuvwxyz");
        System.out.println(ints[0]+" --- "+ints[1]);

    }
}
