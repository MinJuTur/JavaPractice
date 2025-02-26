package Silver.Silver_5.Day13;

import java.util.Scanner;

public class BOJ2167_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                A[i][j] =  sc.nextInt();
            }
        }

        //2차원 합 배열 구하기: S[i][j] = S[i-1][j] + S[i][j-1] + A[i][j] - S[i-1][j-1]
        int[][] S = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                S[i][j] = S[i-1][j] + S[i][j-1] + A[i][j] - S[i-1][j-1];
            }
        }

        int K = sc.nextInt();
        for (int l = 0; l < K; l++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int answer = S[x2][y2] - S[x2][y1-1] - S[x1-1][y2] + S[x1-1][y1-1];
            System.out.println(answer);
        }
    }
}
