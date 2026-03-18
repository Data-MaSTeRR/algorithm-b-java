package basic50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            boolean isValid = true;
            List<Character> list = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {
                // (, [
                if (str.charAt(i) == '(' || str.charAt(i) == '[') list.add(str.charAt(i));

                // )
                if (str.charAt(i) == ')') {
                    if (!list.isEmpty() && list.get(list.size() - 1) == '(') {
                        list.remove(list.size() - 1);
                    } else {
                        isValid = false;
                        break;
                    }
                } else if (str.charAt(i) == ']') { // ]
                    if (!list.isEmpty() && list.get(list.size() - 1) == '[') {
                        list.remove(list.size() - 1);
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && list.isEmpty()) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }

        System.out.print(sb);
    }
}
