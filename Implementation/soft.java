import java.util.*;

public class soft {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrinkml = k * l;
        int totalSlices = c * d;
        int totalSalt = p;

        int toastsByDrink = totalDrinkml / nl;
        int toastsByLime = totalSlices;
        int toastsBySalt = totalSalt / np;

        int totalToasts = Math.min(toastsByDrink, Math.min(toastsByLime, toastsBySalt));

        System.out.println(totalToasts / n);
    }
}
