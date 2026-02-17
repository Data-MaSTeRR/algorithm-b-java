package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        if (line == null) return;
        String word = line.toLowerCase();

        int[] count = new int[26];

        for (int idx = 0; idx < word.length(); idx++) {
            char moji = word.charAt(idx);
            if (moji >= 'a' && moji <= 'z') {
                count[moji - 'a']++;
            }
        }

//        System.out.println(Arrays.toString(count));

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char)(i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.print(result);
    }
}
