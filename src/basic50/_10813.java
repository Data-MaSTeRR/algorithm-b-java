package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 공 교환 횟수

        // 초기 바구니 설정
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int idx1 = Integer.parseInt(st.nextToken()) - 1;
            int idx2 = Integer.parseInt(st.nextToken()) - 1;

            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.print(sb.toString().trim());
    }

}
