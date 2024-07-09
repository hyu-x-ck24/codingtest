package step2;

import java.util.Arrays;
import java.util.Scanner;

public class Pb10 {
    public static void main(String[] args) {
        Pb10 pb10 = new Pb10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        kb.close();
        System.out.println(pb10.Solution(arr, n));
    }

    public int Solution(int[][] args, int n) {
        int answer = 0;
        int[][] newArgs = Arrays.copyOf(args, args.length);
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if (i == 0) {
                    args[i][j] = 0;
                }
                if (i == n + 1) {
                    args[i][j] = 0;
                }
                if (j == 0) {
                    args[i][j] = 0;
                }
                if (j == n + 1) {
                    args[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int[] arr = new int[5];
                arr[0] = newArgs[i][j];
                arr[1] = newArgs[i - 1][j];
                arr[2] = newArgs[i + 1][j];
                arr[3] = newArgs[i][j + 1];
                arr[4] = newArgs[i][j - 1];
                if (this.IsMountain(arr)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public boolean IsMountain(int[] args) {
        boolean answer = true;
        for (int i = 1; i < 5; i++) {
            if (args[i] >= args[0]) {
                answer = false;
            }
        }
        return answer;
    }
}
