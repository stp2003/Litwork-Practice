package contests.module4;

import java.util.Scanner;

public class NumberOfPeopleAwareOfASecret {

    //??
    public static int peopleAwareOfSecret(int n, int delay, int forget) {

        long[] dp = new long[n + 1];
        long mod = (long) 1e9 + 7;
        long share = 0;
        long res = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) {
            dp[i] = share = (share + dp[Math.max(i - delay, 0)] - dp[Math.max(i - forget, 0)] + mod) % mod;
        }

        for (int i = n - forget + 1; i <= n; ++i) {
            res = (res + dp[i]) % mod;
        }

        return (int) res;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int delay = scanner.nextInt();
        int forget = scanner.nextInt();

        int result = peopleAwareOfSecret(n, delay, forget);
        System.out.println(result);
    }
}
