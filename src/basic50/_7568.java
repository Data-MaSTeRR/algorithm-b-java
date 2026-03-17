package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7568 {

    static int rank = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] rankArr = new int[N];

        // i를 랭킹 1등에서 시작해서 큰 것이 등장할 때마다 하나씩 떨어지기
        for (int i = 0; i < N; i++) {
            rank = 1;
            for (int j = 0; j < N; j++) {
                if ((matrix[i][0] < matrix[j][0]) && (matrix[i][1] < matrix[j][1])) {
                    rank++;
                }
            }
            rankArr[i] = rank;
        }

        StringBuilder sb = new StringBuilder();
        for (int r : rankArr) {
            sb.append(r).append(" ");
        }

        System.out.print(sb);
    }
}
