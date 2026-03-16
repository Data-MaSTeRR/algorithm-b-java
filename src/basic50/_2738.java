package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[N][M];

        // 첫번째 + 두번째
        for (int i = 0; i < 2; i++) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < M; c++) {
                    matrix[r][c] += Integer.parseInt(st.nextToken());
                }
            }
        }

        // String 쌓기
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                sb.append(matrix[r][c]).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
