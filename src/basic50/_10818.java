package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000001;
        int max = -1000001;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.print(min + " " + max);
    }

}
