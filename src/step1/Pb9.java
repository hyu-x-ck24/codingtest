package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb9 {
    public static void main(String[] args) throws IOException {
        Pb9 pb9 = new Pb9();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String input = kb.readLine();
        System.out.println(pb9.Solution(input));
        kb.close();
    }

    public int Solution(String str) {
        char[] charStr = str.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (char ch : charStr) {
            if (Character.isDigit(ch)) {
                answer.append(ch);
            }
        }
        return Integer.parseInt(answer.toString());
    }
}
