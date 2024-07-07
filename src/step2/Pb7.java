package step2;

import java.util.Scanner;

public class Pb7 {
    public static void main(String[] args) {
        Pb7 pb7 = new Pb7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] scoreList = new int[n];
        for (int i = 0; i < n; i++) {
            scoreList[i] = kb.nextInt();
        }
        kb.close();
        System.out.println(pb7.Solution(scoreList));
    }
    public int Solution(int[] arr) {
        int cnt = 0;
        int answer= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            answer+=cnt;
        }
        return answer;
    }
}
