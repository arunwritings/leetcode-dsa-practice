package datastructures;

import java.util.Arrays;

public class CountPrimes_204 {

    public int countPrimes(int n) {
        if (n<=2) return 0;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int primeCount = 0;
        for (int i=2;i<n;i++) {
            if (isPrime[i]) {
                primeCount++;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        CountPrimes_204 countPrimes204 = new CountPrimes_204();
        System.out.println(countPrimes204.countPrimes(30));
    }
}
