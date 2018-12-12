package InterviewPreparationKit;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JumpingOnClass {
    // Complete the repeatedString function below.
    public static int jumpingOnClouds(int[] c)
    {
        int total = 0;
        for (int i = 0; i < c.length - 1; i++)
        {
            if (c[i] == 1)
                continue;

            if (i + 2 < c.length && c[i] == c[i + 1] && c[i] == c[i + 2])
            {
                i++;
            }

            total++;
        }
        return total;
    }



    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] cItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        long result = jumpingOnClouds(c);

        System.out.println(String.valueOf(result));
        scan.nextLine();

        scan.close();
    }
}
