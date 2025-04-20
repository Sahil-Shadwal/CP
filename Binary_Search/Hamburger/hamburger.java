import java.util.Scanner;

public class hamburger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String recipe = sc.nextLine();
        int nb = sc.nextInt();
        int ns = sc.nextInt();
        int nc = sc.nextInt();
        int pb = sc.nextInt();
        int ps = sc.nextInt();
        int pc = sc.nextInt();
        long r = sc.nextLong();

        int req_b = 0, req_s = 0, req_c = 0;
        for (char c : recipe.toCharArray()) {
            if (c == 'B')
                req_b++;
            else if (c == 'S')
                req_s++;
            else if (c == 'C')
                req_c++;
        }

        long left = 0;
        long right = (long) 1e18;
        long answer = 0;

        while (left < right) {
            long mid = (left + right) / 2;
            long needed_b = Math.max(0, req_b * mid - nb);
            long needed_s = Math.max(0, req_s * mid - ns);
            long needed_c = Math.max(0, req_c * mid - nc);

            long total_cost = needed_b * pb + needed_s * ps + needed_c * pc;

            if (total_cost <= r) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}

// Hamburger git:(main) ✗ java hamburger.java
// BSC
// 1 1 1
// 1 1 3
// 1000000000000
// 200000000001