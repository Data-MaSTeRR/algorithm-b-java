package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hh = Integer.parseInt(st.nextToken());
        int mm = Integer.parseInt(st.nextToken());

        if (mm >= 45) {
            System.out.println(hh + " " + (mm - 45));
        } else {
            if (hh == 0) {
                System.out.println(23 + " " + (mm + 15));
            } else {
                System.out.println((hh - 1) + " " + (mm + 15));
            }
        }
    }

}
