package step2;

import java.util.Scanner;

public class Pb8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] nWords = new int[n];
        for (int i = 0; i < n; i++) {
            nWords[i] = kb.nextInt();
        }
        Pb8 pb8 = new Pb8();
        System.out.println(pb8.Solution(nWords));
    }

    public String Solution(int[] args) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            int cnt = 1;
            for (int j = 0; j < args.length; j++) {
                if (i == j) {
                    continue;
                }
                if (args[j] > args[i]) {
                    cnt++;
                }
            }
            answer.append(cnt);
            answer.append(" ");
        }
        return String.valueOf(answer).substring(0, answer.length() - 1);
    }
}