package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 2차원 배열에 넣기
        boolean[][] matrix = new boolean[R][C];
        for (int r = 0; r < R; r++) {
            String s = br.readLine();
            for (int c = 0; c < C; c++) {
                if (s.charAt(c) == 'W') matrix[r][c] = false;
                else if (s.charAt(c) == 'B') matrix[r][c] = true;
            }
        }

        int minVal = 64;

        // 8 * 8 범위 내에서
        for (int sr = 0; sr + 8 <= R; sr++) {
            for (int sc = 0; sc + 8 <= C; sc++) {

                // 검증: 개수 세보기 r+c 홀수 짝수 개념으로
                int cnt = 0;
                for (int r = sr; r < sr + 8; r++) {
                    for (int c = sc; c < sc + 8; c++) {
                        if ((r + c) % 2 == 0 && !matrix[r][c]) cnt++;
                        else if ((r + c) % 2 != 0 && matrix[r][c]) cnt++;
                    }
                }

                if (minVal > cnt) minVal = cnt;
                if (minVal > 64 - cnt) minVal = 64 - cnt;

            }
        }

        System.out.print(minVal);
    }
}
