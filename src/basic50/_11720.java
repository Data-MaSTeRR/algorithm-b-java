package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int result = 0;
        for (int i = 0; i < size; i++) {
            result += arr[i] - '0';
        }

        System.out.print(result);
    }

}
