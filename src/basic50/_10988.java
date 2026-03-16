package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] wordArr = br.readLine().trim().toCharArray();

        System.out.print(check(wordArr));
    }

    static int check(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // start == end (홀수), start > end (짝수)에서 stop
        while (start < end) {
            if (arr[start] != arr[end]) {
                return 0;
            }
            start++;
            end--;
        }

        return 1; // 모두 통과
    }

}
