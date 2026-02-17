package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().trim().toCharArray();

//        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) {
            System.out.print(0);
            return;
        }

        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') result++;
        }

        System.out.print(result);
    }

}
