package step2;

import java.util.Scanner;

public class Pb9 {
    public static void main(String[] args) {
        Pb9 pb9 = new Pb9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] nArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nArray[i][j] = kb.nextInt();
            }
        }
        kb.close();
        int[] answerArr = new int[3];
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            answerArr[i] = switch (i) {
                case 0 -> pb9.Solution1(nArray, n);
                case 1 -> pb9.Solution2(nArray, n);
                case 2 -> pb9.Solution3(nArray, n);
                default -> throw new IllegalStateException("Unexpected value: " + i);
            };
            if (answer < answerArr[i]) {
                answer = answerArr[i];
            }
        }
        System.out.println(answer);

    }

    // 가로합중 max
    public int Solution1(int[][] args, int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max += args[i][j];
            }
            if (max > answer) {
                answer = max;
            }
        }
        return answer;
    }

    // 세로합중 max
    public int Solution2(int[][] args, int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max += args[j][i];
            }
            if (max > answer) {
                answer = max;
            }
        }
        return answer;
    }

    // 대각선합중 max
    public int Solution3(int[][] args, int n) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    max += args[i][j];
                }
            }
        }
        if (max > answer) {
            answer = max;
        }
        max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((n - 1 - i) == j) {
                    max += args[i][j];
                }
            }
        }
        if (max > answer) {
            answer = max;
        }

        return answer;
    }

}
