package Bronze_4.Day13;

import java.util.Scanner;

public class BOJ11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int apple1 = sc.nextInt();
        int orange1 = sc.nextInt();
        int apple2 = sc.nextInt();
        int orange2 = sc.nextInt();

        System.out.println(Math.min(apple1 + orange2, orange1 + apple2));
    }
}
