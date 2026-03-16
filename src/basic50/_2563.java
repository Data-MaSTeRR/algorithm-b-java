package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563 {
    public static void main(String[] args) throws IOException {

        boolean[][] matrix = new boolean[101][101];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sc = Integer.parseInt(st.nextToken());
            int sr = Integer.parseInt(st.nextToken());

            for (int r = sr; r < sr + 10; r++) {
                for (int c = sc; c < sc + 10; c++) {
                    if (matrix[r][c]) continue;
                    matrix[r][c] = true;
                    answer++;
                }
            }
        }

        System.out.print(answer);
    }
}
