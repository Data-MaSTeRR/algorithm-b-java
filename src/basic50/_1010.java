package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 점화식: nCr = n-1Cr-1 + n-1Cr
// 메모이제이션: dp[][]
public class _1010 {

    static final int[][] dp = new int[31][31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(combine(n, r)).append('\n');
        }

        System.out.print(sb);
    }

    public static int combine(int n, int r) {
        // 메모이제이션
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        // 점화식 -> 재귀
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = combine(n - 1, r - 1) + combine(n - 1, r);
    }
}

/**
public class _1010 {

    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {

            result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = j + 1;
            }

            boolean[] visited = new boolean[n];
            combination(n, r, 0, arr, visited);

            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }

    public static void combination(int n, int r, int start, int[] arr, boolean[] visited) {
        // 종료조건
        if (r == 0) {
            result++;
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(n, r - 1, i + 1, arr, visited);
            visited[i] = false;
        }
    }
}
*/
