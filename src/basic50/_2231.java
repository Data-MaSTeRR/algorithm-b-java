package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(calculate(N));
    }

    public static long calculate(int num) {
        for (int i = 1; i < num; i++) {

            int temp = i;
            int sum = i;
            while (true) {
                sum += temp % 10;

                if (temp / 10 == 0) break;
                temp /= 10;
            }

            if (sum == num) return i;
        }

        return 0;
    }
}
