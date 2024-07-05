package step2;

import java.util.Scanner;

public class Pb3 {
    public static void main(String[] args){
        Pb3 pb3 = new Pb3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] A = new int[n], B = new int[n];
        char[] answer = new char[n];
        for (int i = 0; i < n ; i++) {
            A[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = kb.nextInt();
            answer[i] = pb3.Solution(A[i], B[i]);
            System.out.println(answer[i]);
        }
    }

    public char Solution(int a, int b) {
        if (a == b) {
            return 'D';
        } else if (Math.abs(a-b) == 2) {
            if (a > b) {
                return 'B';
            }
        } else if (Math.abs(a-b) == 1) {
            if (b > a) {
                return 'B';
            }
        }
        return 'A';
    }
}
