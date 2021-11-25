package LeetCode.Problems.Easy.ArrayAndList;

public class MaximumRepeatingSubstring1668 {

    public static int maxRepeating(String sequence, String word) {
        int maxRepeat=0;
        for(int i=0;i<sequence.length();i++){
            int rep=0;
            if(sequence.charAt(i)==word.charAt(0)){
                int k=i;
                int c=0;
                for(int j=0;j<word.length() && k <sequence.length() ;j++){
                    if(word.charAt(j)==sequence.charAt(k)){
                        c++;
                        k++;
                    }
                    else {
                        break;
                    }
                    if(c==word.length()){
                        rep++;
                        j=-1;
                        c=0;
                    }
                }
                if(rep>maxRepeat)
                    maxRepeat=rep;
            }
        }
        return maxRepeat;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
        System.out.println(maxRepeating("ababc", "ba"));
        System.out.println(maxRepeating("ababc", "ac"));
        System.out.println(maxRepeating("a", "a"));
    }
}
