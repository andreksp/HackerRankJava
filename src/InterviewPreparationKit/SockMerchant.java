package InterviewPreparationKit;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
    // Complete the sockMerchant function below.
    public static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int value : ar) {

            if (map.containsKey(value))
            {
                Integer currentValue = map.get(value);
                map.put(value, ++currentValue);
            }
            else
            {
                map.put(value, 1);
            }
        }

        Integer totalPairs = 0;

        for(Map.Entry<Integer, Integer> item: map.entrySet())
        {
            totalPairs += (int)(item.getValue() / 2);
        }

        return totalPairs;
    }


    private String str;
    private boolean bln;

    public static void main(String[] args) throws IOException {

        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a', 'b'};

        arr1 = arr2;

        SockMerchant sm = new SockMerchant();
        System.out.println("TestsStr" + sm.str);
        System.out.println("testeBollean" + sm.bln);

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf(result));
        scan.nextLine();

        scan.close();
    }
}
