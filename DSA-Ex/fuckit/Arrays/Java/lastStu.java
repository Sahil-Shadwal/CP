import java.util.*;

public class lastStu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char maxChar = s.charAt(0);
        int index = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > maxChar) {
                maxChar = s.charAt(i);
                index = i;
            } else if (s.charAt(i) == maxChar) {
                String current = s.substring(i);
                String existing = s.substring(index);
                if (current.compareTo(existing) > 0) {
                    index = i;
                }
            }
        }
        System.out.println(s.substring(index));

    }
}
