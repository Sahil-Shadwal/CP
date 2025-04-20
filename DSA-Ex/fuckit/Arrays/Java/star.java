import java.util.*;

public class star {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        int n = sc.nextInt();

        int startIndex[] = new int[n];
        int endIndex[] = new int[n];

        for (int i = 0; i < n; i++) {
            startIndex[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            endIndex[i] = sc.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int start = startIndex[i];
            int end = endIndex[i];

            String sub = s.substring(start, end + 1);

            int starCount = 0;
            boolean insideBars = false;

            for (char ch : sub.toCharArray()) {
                if (ch == '|') {
                    insideBars = !insideBars;
                } else if (ch == '*' && insideBars) {
                    starCount++;
                }
            }

            result[i] = starCount;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}

// import java.util.*;

// public class StarsBetweenBars {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int n = sc.nextInt();

// int[] startIndex = new int[n];
// int[] endIndex = new int[n];
// for (int i = 0; i < n; i++) startIndex[i] = sc.nextInt();
// for (int i = 0; i < n; i++) endIndex[i] = sc.nextInt();

// int len = s.length();
// int[] prefixStars = new int[len];
// int[] leftBar = new int[len];
// int[] rightBar = new int[len];

// // Fill prefixStars (number of stars between bars up to index i)
// int stars = 0;
// int lastBar = -1;
// for (int i = 0; i < len; i++) {
// if (s.charAt(i) == '|') {
// lastBar = i;
// }
// if (s.charAt(i) == '*' && lastBar != -1) {
// stars++;
// }
// prefixStars[i] = stars;
// }

// // Fill nearest left bar
// lastBar = -1;
// for (int i = 0; i < len; i++) {
// if (s.charAt(i) == '|') lastBar = i;
// leftBar[i] = lastBar;
// }

// // Fill nearest right bar
// lastBar = -1;
// for (int i = len - 1; i >= 0; i--) {
// if (s.charAt(i) == '|') lastBar = i;
// rightBar[i] = lastBar;
// }

// for (int i = 0; i < n; i++) {
// int start = rightBar[startIndex[i]];
// int end = leftBar[endIndex[i]];

// if (start == -1 || end == -1 || start >= end) {
// System.out.println(0);
// } else {
// System.out.println(prefixStars[end] - prefixStars[start]);
// }
// }
// }
// }
