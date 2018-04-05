package CrackingCodeInterview;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLeftRotation
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        List<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i < k;i++)
        {
            temp.add(a[i]);
        }

        for(int i = 0; i < n - k ; i++) {
            a[i] = a[i + k];
        }

        int count = 0;

        for(int i = n - k; i < n; i++) {
            a[i] = temp.get(count);
            count++;
        }

        StringBuilder str = new StringBuilder();
        for(int i: a)
        {
            str.append(i);
            str.append(" ");
        }
        System.out.println(str.toString());

    }
}
