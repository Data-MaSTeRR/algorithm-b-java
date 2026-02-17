package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622 {

    static int[] dialTime = {
            3, 3, 3, // a, b, b
            4, 4, 4,
            5, 5, 5,
            6, 6, 6,
            7, 7, 7,
            8, 8, 8, 8,
            9, 9, 9,
            10, 10, 10, 10
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] wordArr = br.readLine().toCharArray();

        int totalTime = 0;
        for (int i = 0; i < wordArr.length; i++) {
            totalTime += dialTime[wordArr[i] - 'A'];
        }

        System.out.print(totalTime);
    }

}
