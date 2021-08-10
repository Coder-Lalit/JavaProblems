package LeetCode.Problems.Easy;

public class PrimeArrangements1175 {
    final static int MOD = 1000000007;
    public static int numPrimeArrangements(int n) {
        int pc=0;
        for(int i=1;i <=n;i++){
            if(isPrime(i)) pc++;
        }

        int i;
        long prod = 1;

        for(i = 1; i <= pc; i++){
            prod = (prod * i) % MOD;
        }

        for(i = 1; i <= (n - pc); i++){
            prod = (prod * i) % MOD;     // number of desired permutations = p! * (n - p)!
        }

        return (int)prod;


    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(5));
    }
}
