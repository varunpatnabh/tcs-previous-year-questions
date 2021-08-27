import java.util.*;

public class numseries3Twist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        n -= 1;
        int a = 0, b = 0;
        int[] ser = new int[n + 1];
        ser[0] = 0;
        ser[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                a = a + 2;
                ser[i] = a;

            } else {
                b = a / 2;
                ser[i] = b;
            }
        }System.out.println(ser[n]);
    }
}
