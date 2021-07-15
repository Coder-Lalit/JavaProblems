package LeetCode.Problems.Easy.Random;

public class SimilarRGBColor800 {
    public String similarRGB(String color) {
        char[] RGB =color.toCharArray();
        return "#"+nextShotHand(color.substring(1,3))+nextShotHand(color.substring(3,5))+nextShotHand(color.substring(5,7));
    }

    String nextShotHand(String x){
        int i = Integer.parseInt(x, 16);
        if(i%17!=0){
            int y = i/17;
            String res = Integer.toHexString(Math.abs(i-(y*17)< Math.abs(i-((y+1)*17))?y*17:(y+1)*17));
            return res.length()==1? "0"+res:res;
        }else{
            return x;
        }
    }

    public static void main(String[] args) {
        SimilarRGBColor800 s = new SimilarRGBColor800();
        System.out.println(s.similarRGB("#09f166"));
    }
}
