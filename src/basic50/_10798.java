package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[15][5];

        // 담기
        for (int r = 0; r < 5; r++) {
            String str = br.readLine();
            for (int c = 0; c < str.length(); c++) {
                matrix[c][r] = str.charAt(c);
            }
        }

        // 꺼내기
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < 15; r++) {
            for (int c = 0; c < 5; c++) {
                if (matrix[r][c] == 0) continue;
                sb.append(matrix[r][c]);
            }
        }

        System.out.print(sb);
    }
}
