package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1316 {

    static final boolean[] hashTable = new boolean[26];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            if (checkGroup(arr)) count++;
//            System.out.println("현재 : " + i + " - 횟수 " + count);
        }

        System.out.print(count);
    }

    public static boolean checkGroup(char[] arr) {

        // 배열 초기화 -> new x
        Arrays.fill(hashTable, false);

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (i == 0) continue;

            char prev = arr[i - 1];
            char now = arr[i];

            if (hashTable[now - 'a']) return false;

            if (prev != now) {
                hashTable[prev - 'a'] = true;
            }
        }

        return true;
    }

}
