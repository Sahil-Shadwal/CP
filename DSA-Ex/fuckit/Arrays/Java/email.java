
import java.util.*;

public class email {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();
        int duplicates = 0;

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            freq.put(id, freq.getOrDefault(id, 0) + 1);
            if (freq.get(id) > 1) {
                duplicates++;
            }
        }
        System.out.println(duplicates);
    }
}
