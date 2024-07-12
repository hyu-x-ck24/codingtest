package step2;

import java.util.Arrays;
import java.util.Scanner;

public class Pb12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        Pb12 pb12 = new Pb12();
        System.out.println(pb12.Solution(arr, n, m));
    }

    public int Solution(int[][] arr, int n, int m) {
        if (n == 1) {
            return 0;
        }
        // arr[m(테스트 횟수)][n(학생수)]
        // 멘토와 멘티가 한 짝이 되려면 멘토는 멘티보다 모든 테스트에서 등수가 앞서야 한다.
        // 학생수가 n 명이라면 n*n-1 -> 멘토와 멘티가 될수 있는 경우의수
        // 최대 경우의 수인 n*n-1 에서 하나씩 제외시키면 될것
        // 테스트 횟수만큼 반복문을 돌면서 a -> a가 아닌 친구와 멘토가 될 수 있는지 확인하면 될듯!
        int maxAnswer = n * (n - 1);
        for (int a = 1; a < n + 1; a++) {
            for (int b = 1; b < n + 1; b++) {
                if (a == b) {
                    continue;
                }
                boolean isPossible = true;
                for (int i = 0; i < m; i++) {
                    if (!isPossible) {
                        continue;
                    }
                    int indexA = -1;
                    int indexB = -1;
                    for (int k = 0; k < arr[i].length; k++) {
                        if (arr[i][k] == a) {
                            indexA = k;
                        }
                        if (arr[i][k] == b) {
                            indexB = k;
                        }
                    }
                    if (indexA > indexB) {
                        isPossible = false;
                    }
                }
                if (!isPossible) {
                    maxAnswer--;
                }
            }
        }
        return maxAnswer;
    }
}
