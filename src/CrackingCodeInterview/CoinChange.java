package CrackingCodeInterview;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }

        System.out.println( countWays(coins, m, n));
    }

    static long countWays(int S[], int m, int n)
    {
        long[] table = new long[n+1];

        Arrays.fill(table, 0);   //O(n)

        table[0] = 1;

        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];

        return table[n];
    }
}
