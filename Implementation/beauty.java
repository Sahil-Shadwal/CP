
// https://codeforces.com/problemset/problem/263/A
import java.util.*;

public class beauty {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = 0, col = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int value = sc.nextInt();
                if (value == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);
    }
}

// ➜ Implementation git:(main) ✗ java beauty.java
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 1 0 0 0
// 0 0 0 0 0
// 2