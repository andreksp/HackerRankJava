package CrackingCodeInterview;

import java.util.Scanner;

public class BalancedBrakets {
    public static boolean isBalanced(String expression) {

        String temp = expression;

        String newstr = expression.replace("{}", "").replace("[]", "").replace("()", "");

        if ( newstr.equals(""))
            return true;

        if ( temp != newstr)
        {
            return isBalanced(newstr);
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
