package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb11 {
    public static void main(String[] args) throws IOException {
        Pb11 pb11 = new Pb11();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String input = kb.readLine();
        System.out.println(pb11.Solution(input));
    }

    public String Solution(String input) {
        /**
         * KKHSSSSSSSE -> K2HS7E
         * answer변수 생성 (빈 문자열)
         * 처음 문자를 기억하고 cnt1 -> 항상 처음보는 문자를 만나면 answer에 저장하고 cnt=1로 초기화
         * 다음 문자가 처음과 같으면 해당 문자는 cnt++
         * 다음 문자가 처음과 다르면 cnt값을 answer에 추가하고(1이면 생략) cnt는 1로 초기화
         */
        StringBuilder answer = new StringBuilder();
        char[] chArr = input.toCharArray();
        int cnt = -1;
        char tmp = '#';
        for (int i = 0; i < input.length(); i++) {
            if (tmp != chArr[i]) {
                if (cnt != -1 && cnt != 1) {
                    answer.append(cnt);
                }
                answer.append(chArr[i]);
                tmp = chArr[i];
                cnt = 1;
            } else {
                cnt++;
            }
            if (i == input.length() - 1 && cnt > 1) {
                answer.append(cnt);
            }
        }
        return String.valueOf(answer);
    }
}
