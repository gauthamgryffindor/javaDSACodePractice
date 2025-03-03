package Math;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                count++;
        }
        return count == 1;

    }
}
