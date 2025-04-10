//  https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

public class bitplus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = sc.nextLine();
            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }

        }
        System.out.println(x);
    }
}

// ➜ CP cd BIT++
// ➜ BIT++ java bitplus.java
// 2
// ++x
// --x
// 0
// ➜ BIT++ java bitplus.java
// 5
// ++x
// x++
// --x
// x--
// ++x
// 1