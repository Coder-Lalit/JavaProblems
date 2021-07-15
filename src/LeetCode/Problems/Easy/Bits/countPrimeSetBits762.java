package LeetCode.Problems.Easy.Bits;

public class countPrimeSetBits762 {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left; i<= right;i++){
            if(isPrime(bitCount(i))) c++;
        }
        return c;
    }

    public int bitCount(int n){
        int c=0;
        while(n!=0){
            if(n%2==1) c++;
            n/=2;
        }
        return c;
    }

    //is prime numbers
    // 2, 3, 5, 7, 11, 13, 17, 19
    public boolean isPrime(int c){
        return (c==2 ||c==3 ||c==5 ||c==7 ||c==11 ||c==13 ||c==17 ||c==19);
    }

    public static void main(String[] args) {
        countPrimeSetBits762 c = new countPrimeSetBits762();
        c.countPrimeSetBits(6,10);
    }
}
