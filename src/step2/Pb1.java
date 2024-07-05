package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1 {
    public static void main(String[] args)throws IOException {
        Pb1 pb1 = new Pb1();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(kb.readLine());
        String Nword = kb.readLine();
        kb.close();
        int[] NwordIntArr = pb1.StringToIntArr(Nword);
        System.out.println(pb1.Solution(NwordIntArr, N));
    }

    public String Solution(int[] NwordIntArr, int N) {
        StringBuilder answer = new StringBuilder();
        answer.append(NwordIntArr[0]);
        int tmp = NwordIntArr[0];
        for (int i = 1; i < NwordIntArr.length; i++) {
            if (NwordIntArr[i] > tmp) {
                answer.append(" ");
                answer.append(NwordIntArr[i]);
            }
            tmp = NwordIntArr[i];
        }
        return String.valueOf(answer);
    }

    public int[] StringToIntArr (String str) {
        String[] strArr = str.split(" ");
        int[] answer = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}
