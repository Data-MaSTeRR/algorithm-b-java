package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++; // 우선 한 글자로 인정

            if (i >= arr.length - 1) continue; // 마지막 글자면 다음 체크 생략

            char cur = arr[i];
            char next = arr[i+1];

            // '다음 글자'를 보고 한 세트라면 인덱스(i)를 추가로 점프
            if (cur == 'c' && (next == '=' || next == '-')) i++;
            else if (cur == 'd' && next == '-') i++;
            else if (cur == 'd' && next == 'z' && i + 2 < arr.length && arr[i+2] == '=') i += 2;
            else if ((cur == 'l' || cur == 'n') && next == 'j') i++;
            else if ((cur == 's' || cur == 'z') && next == '=') i++;
        }

        System.out.println(count);

            /**
             * String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "arr=", "z="};
             *
             *         for (String val : croatiaAlphabets) {
             *             if (str.contains(val)) {
             *                 str = str.replace(val, "!");
             *             }
             *         }
             *
             *         System.out.print(str.length());
             */
    }
}
