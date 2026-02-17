package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashSet;

public class _3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * - 방법1 : HashSet 이용
         * HashSet<Integer> set = new HashSet<>();
         *
         *         for (int i = 0; i < 10; i++) {
         *             set.add(Integer.parseInt(br.readLine()) % 42);
         *         }
         *
         *         System.out.print(set.size());
         */

        // 방법2 : 배열 이용
        boolean[] table = new boolean[42];

        for (int i = 0; i < 10; i++) {
            table[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int answer = 0;
        for (boolean tf : table) {
            if (tf) answer++;
        }

        System.out.print(answer);
    }

}
