package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxVal = -1;
        int maxRow = 0;
        int maxCol = 0;

        for (int r = 1; r < 10; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 1; c < 10; c++) {
                int temp = Integer.parseInt(st.nextToken());

                if (temp > maxVal) {
                    maxVal = temp;
                    maxRow = r;
                    maxCol = c;
                }
            }
        }

        System.out.println(maxVal);
        System.out.print(maxRow + " " + maxCol);
    }
}
