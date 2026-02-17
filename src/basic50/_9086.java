package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < TC; i++) {
            String word = br.readLine();
            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);

            sb.append(start).append(end).append('\n');
        }

        System.out.print(sb);
    }
}
