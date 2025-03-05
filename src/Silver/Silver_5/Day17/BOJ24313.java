package Silver.Silver_5.Day17;

import java.util.Scanner;

public class BOJ24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean isOK = true;
        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                isOK = false;
                break;
            }
        }

        if (isOK) System.out.println(1);
        else System.out.println(0);
    }
}
