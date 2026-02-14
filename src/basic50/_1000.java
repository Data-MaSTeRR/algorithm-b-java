package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1000 {

    public static void main(String[] args) throws IOException {

        // 1. BufferedReader를 사용하여 입력을 빠르게 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. 공백 단위로 문자열을 자르기 위해 StringTokenizer를 사용합니다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }

}
