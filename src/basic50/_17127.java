package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _17127 {

    static int N;
    static int maxVal = -1;
    static List<Integer> combined = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // n, r, s, d
        combine(N, 4, 0, 0, arr);

        System.out.print(maxVal);
    }

    public static void combine(int n, int r, int s, int d, int[] arr) {
        if (r == d) {
            calculate(n, r, arr);
            return;
        }

        for (int i = s; i < n; i++) {
            combined.add(i);
            combine(n, r, i + 1, d + 1, arr);
            combined.remove(combined.size() - 1);
        }
    }

    public static void calculate(int n, int r, int[] arr) {
        int sum = 0;
        int temp = 0;
        for (int i = 1; i < r; i++) {
            int prev = combined.get(i - 1);
            int now = combined.get(i);

            int product = 1;
            for (int s = prev; s < now; s++) {
                product *= arr[s];
            }
            sum += product;
            temp++;

            if (temp == 3) {
                product = 1;
                for (int j = now; j < n; j++) {
                    product *= arr[j];
                }
                sum += product;
            }
        }

        if (maxVal < sum) {
            maxVal = sum;
        }
    }
}
