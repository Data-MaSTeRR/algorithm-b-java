package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        for (int idx = 1; idx <= N; idx++) {
            arr[idx] = idx;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken());
            int endIdx = Integer.parseInt(st.nextToken());

            while (true) {
                if (startIdx >= endIdx) break;

                int temp = arr[startIdx];
                arr[startIdx] = arr[endIdx];
                arr[endIdx] = temp;

                startIdx++;
                endIdx--;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int idx = 1; idx <= N; idx++) {
            sb.append(arr[idx]).append(" ");
        }

        System.out.print(sb.toString().trim());
    }

}
