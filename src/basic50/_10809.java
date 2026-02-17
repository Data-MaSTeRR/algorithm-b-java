package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] wordArr = br.readLine().toCharArray();
        int[] posArr = new int[26];
        Arrays.fill(posArr, -1);

        for (int posIdx = 0; posIdx < wordArr.length; posIdx++) {
            char target = wordArr[posIdx];
            int targetIdx = target - 'a';

            if (posArr[targetIdx] == -1) {
                posArr[targetIdx] = posIdx;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            sb.append(posArr[i]).append(" ");
        }

        System.out.print(sb);
    }

}
