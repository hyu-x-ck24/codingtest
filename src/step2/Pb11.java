package step2;

import java.util.Scanner;

public class Pb11 {
    public static void main(String[] args) {
        Pb11 pb11 = new Pb11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] nArr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                nArr[i][j] = kb.nextInt();
            }
        }
        System.out.println(pb11.Solution(nArr, n));
    }

    public int Solution(int[][] arr, int n) {
        int[] studentCnt = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && this.twoStudentchk(arr[i], arr[j])) {
                    studentCnt[i]++;
                }
            }
        }

        int maxStudent = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (studentCnt[i] > maxCount) {
                maxCount = studentCnt[i];
                maxStudent = i;
            }
        }
        return maxStudent + 1;
    }

    public boolean twoStudentchk(int[] aStudent, int[] bStudent) {
        for (int i = 0; i < 5; i++) {
            if (aStudent[i] == bStudent[i]) {
                return true;
            }
        }
        return false;
    }
}