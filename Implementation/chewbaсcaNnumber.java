
// https://codeforces.com/contest/514/problem/A
import java.util.*;

public class chewbaсcaNnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            int digit = x.charAt(i) - '0';
            int inverted = 9 - digit;

            if (i == 0 && inverted == 0) {
                result.append(digit);
            } else {
                result.append(Math.min(digit, inverted));
            }

        }
        System.out.println(result.toString());
    }
}
