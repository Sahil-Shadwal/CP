import java.util.*;

public class meeting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int positions[] = new int[3];
        positions[0] = sc.nextInt();
        positions[1] = sc.nextInt();
        positions[2] = sc.nextInt();

        Arrays.sort(positions);

        int totalDistance = Math.abs(positions[0] - positions[1]) +
                Math.abs(positions[1] - positions[1]) + Math.abs(positions[2] - positions[1]);

        System.out.println(totalDistance);
    }
}
