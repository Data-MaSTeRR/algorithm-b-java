package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int cnt = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {

            // 예외 - 마지막은 볼 필요가 없음
            if (i == length - 1) {
                cnt++;
                break;
            }

            char now = arr[i];
            char nxt = arr[i + 1];

            // 2글자
            if (now == 'c' && (nxt == '-' || nxt == '=')) i++;
            else if (nxt == 'j' && (now == 'l' || now == 'n')) i++;
            else if (nxt == '=' && (now == 's' || now == 'z')) i++;
            else if (now == 'd' && nxt == '-') i++;

            // 예외 - 3글자
            else if ((now == 'd' && nxt == 'z') && i + 2 < length && arr[i + 2] == '=') i += 2;

            cnt++;
        }

        System.out.print(cnt);
    }
}
