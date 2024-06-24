package step1;

import java.util.Scanner;

public class Pb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pb3 pb3 = new Pb3();
        String words = sc.nextLine();
        System.out.println(pb3.solution(words));
        sc.close();
    }

    public String solution(String str) {
        // str의 단어를 공백 기준으로 잘라서 chkWord메서드 호출
        if (!str.contains(" ")) {
            return str;
        }
        String[] words = str.split(" ");
        String res = words[0];
        for (String word : words) {
            res = cntWord(res, word);
        }
        return res;
    }

    public String cntWord(String str1, String str2) {
        // str1,str2의 글자수를 비교해서 글자수가 큰 단어 반환
        if (str1.length() >= str2.length()) {
            return str1;
        }
        return str2;
    }
}
