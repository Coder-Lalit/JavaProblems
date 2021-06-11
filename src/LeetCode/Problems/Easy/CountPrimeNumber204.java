package LeetCode.Problems.Easy;

import java.util.ArrayList;
import java.util.List;

public class CountPrimeNumber204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(500000));
    }
    public static int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int i =3;i<n;i++){
            if(isPrime(primes,i)){
                primes.add(i);
                //System.out.println(i);
            }
        }
        return primes.size();
    }
    public static boolean isPrime(List<Integer> primes,int n){
        for (Integer i : primes){
            if(i*i>n) {
                break;
            }
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimes2(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] numbers = new boolean[n];
        for (int p = 2; p <= (int)Math.sqrt(n); ++p) {
            if (numbers[p] == false) {
                for (int j = p*p; j < n; j += p) {
                    numbers[j] = true;
                }
            }
        }

        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (numbers[i] == false) {
                ++numberOfPrimes;
            }
        }

        return numberOfPrimes;
    }

}
