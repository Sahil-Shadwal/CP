import java.util.*;

public class deamon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(getMin(n, str));
    }

    public static int getMin(int n, String str) {
        int powers[] = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            powers[i] = str.charAt(i) - '0';
            total += powers[i];
        }

        Arrays.sort(powers);
        reverseArray(powers);

        int stephanPower = 0;
        int damonPower = total;

        for (int power : powers) {
            stephanPower += power;
            damonPower -= power;
            if (stephanPower > damonPower)
                break;
        }

        return stephanPower;
    }

    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
