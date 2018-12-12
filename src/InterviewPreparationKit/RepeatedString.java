package InterviewPreparationKit;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n)
    {
        long numberOfAs = s.chars().mapToObj(x->(char)x).filter(p -> p == 'a').count();
        int totalChars = s.toCharArray().length;

        long totalNumberOfAs = ((n / totalChars)) * numberOfAs;

        int missingChars = (int)(n % totalChars);

        if (missingChars > 0)
        {
            totalNumberOfAs += s.substring(0, missingChars).chars().mapToObj(x->(char)x).filter(p -> p == 'a').count();
        }
        return totalNumberOfAs;
    }



    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String arItems = scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        long result = repeatedString(arItems, (long)n);

        System.out.println(String.valueOf(result));
        scan.nextLine();

        scan.close();
    }
}
