package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니 수
        int M = Integer.parseInt(st.nextToken()); // 공 넣는 시뮬레이션 수

        // 바구니 배열 만들기 - 초기값 0
        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());

            Arrays.fill(arr, start - 1, end, ballNum);
            /**
             * for (int idx = start - 1; idx < end; idx++) {
             *                 arr[idx] = ballNum;
             *             }
             */
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }

}
