package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(matrix, (e1, e2) -> {
                if (e1[0] != e2[0]) return Integer.compare(e1[0], e2[0]);
                return Integer.compare(e1[1], e2[1]);
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(matrix[i][0]).append(" ").append(matrix[i][1]).append('\n');
        }

        System.out.print(sb);
    }
}
