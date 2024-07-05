package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb12 {

    public static void main(String[] args) throws IOException {
        Pb12 pb12 = new Pb12();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int wordCnt = Integer.parseInt(kb.readLine());
        String input = kb.readLine();
        kb.close();
        System.out.println(pb12.Solution(input, wordCnt));
    }

    public String Solution(String input, int wordCnt) {
        String[] nWord = this.NBinWordSolution(input, wordCnt);
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < wordCnt; i++) {
            int bin = this.BinToDecimal(nWord[i]);
            char tmp = (char) bin;
            answer.append(tmp);
        }
        return String.valueOf(answer);
    }

    public int BinToDecimal(String bin) {
        char[] chArr = bin.toCharArray();
        int answer = 0;
        for (int i = 0; i < 7; i++) {
            if (chArr[i] == '1') {
                answer += (int) Math.pow(2, 6 - i);
            }
        }
        return answer;
    }

    public String[] NBinWordSolution(String input, int wordCnt) {
        String convertString = this.ConvertSolution(input);
        String[] answer = new String[wordCnt];

        for (int i = 0; i < wordCnt; i++) {
            answer[i] = convertString.substring((i * 7), 7 + (i * 7));
        }
        return answer;
    }

    public String ConvertSolution(String str) {
        char[] chArr = str.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (char ch : chArr) {
            if (ch == '#') {
                answer.append(1);
            } else if (ch == '*') {
                answer.append(0);
            }
        }
        return String.valueOf(answer);
    }
}
