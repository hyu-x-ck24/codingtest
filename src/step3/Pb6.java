package step3;

import java.util.Scanner;

public class Pb6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(), k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();
        Pb6 pb6 = new Pb6();
        System.out.println(pb6.Solution(arr, k));
    }

    public int Solution(int[] arr, int k) {
        if (zeroCnt(arr) < k) {
            return arr.length;
        }
        int changeZero = 0;
        int p1 = 0;
        int p2 = 0;
        int maxAns = 0;
        while (p1 < arr.length-1) {
            if (arr[p1] == 1) {
                p2 = p1+1;
                while(p2 < arr.length && changeZero <= k) {
                    if (arr[p2] == 0) {
                        changeZero++;
                    }
                    p2++;
                }
                changeZero = 0;
                // p2-2가 체크
                if (p2-1-p1 > maxAns) {
                    maxAns = p2-1-p1;
                }
            }
            p1++;
        }
        return maxAns;
    }

    public int zeroCnt(int[] arr) {
        int answer = 0;
        for (int tmp : arr) {
            if (tmp == 0) {
                answer++;
            }
        }
        return answer;
    }
}
