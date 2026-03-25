package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1244 {

    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if (temp == 1) arr[i] = true;
            else arr[i] = false;
        }

//        System.out.println(Arrays.toString(arr));

        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int standard = Integer.parseInt(st.nextToken());

            // 남자
            if (gender == 1) man(standard, arr);
            // 여자
            else if (gender == 2) woman(standard, arr);

//            System.out.println(Arrays.toString(arr));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i] ? 1 : 0);

            if ((i + 1) % 20 == 0) sb.append("\n");
            else sb.append(" ");
        }

        System.out.print(sb);
    }

    public static void man(int standard, boolean[] arr) {
        for (int i = 1; i < arr.length + 1; i++) {
            if (i % standard == 0) {
                arr[i - 1] = !arr[i - 1];
            }
        }
    }

    public static void woman(int standard, boolean[] arr) {

        int u = standard - 1;
        int d = standard - 1;
        arr[u] = !arr[u];

        while (true) {
            u++;
            d--;

            if (d < 0 || u >= arr.length) break;

            if (arr[u] == arr[d]) {
                arr[u] = !arr[u];
                arr[d] = !arr[d];
            } else {
                break;
            }
        }
    }

}
