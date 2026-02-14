package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int offset = N;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j >= offset) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            offset -= 1;
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
