package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double max = 0;
        for (int si = 0; si < N; si++) {
            double temp = 1;
            for (int i = si; i < N; i++) {
                temp *= arr[i];
                if (max < temp) {
                    max = temp;
                }
            }
        }

        System.out.printf("%.3f", max);
    }

}
