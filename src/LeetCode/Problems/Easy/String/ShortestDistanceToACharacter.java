package LeetCode.Problems.Easy.String;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int [] res = new int [s.length()];
        int lastSeen=-1;
        for(int i=0 ; i<s.length();i++){
            if(lastSeen ==-1){
                res[i]=s.length();
            }else{
                res[i]=Math.abs(i-lastSeen);
            }
            if(s.charAt(i)==c){
                lastSeen=i;
                res[i]=0;
                int x=i-1;
                while(x>=0){
                    if(res[x] > Math.abs(i-x)){
                        res[x]=Math.abs(i-x);
                    }else{
                        break;
                    }
                    x--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ShortestDistanceToACharacter s = new ShortestDistanceToACharacter();
        for(int i: s.shortestToChar("loveleetcode",'e')){
            System.out.print(i+" ");
        }
    }
}
