package step3;

import java.util.Scanner;

public class Pb4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Pb4 pb4 = new Pb4();
        System.out.println(pb4.Solution(arr, m));
    }

    public int Solution(int[] arr, int m) {
        int p1 = 0;
        int pEnd = arr.length-1;
        int cnt = 0;
        // p1이 m보다 큰지 체크
        // p1이 m보다 작으면 p1+n번 더함(m보다 크지 않을때까지만)
        // 더하다가 m이되면 cnt++;
        // m보다 커지면 p1 +1 해서 다시 연산
        while(p1<=pEnd) {
            if (arr[p1] > m) {
                continue;
            } else {
                int addNum = arr[p1];
                int p2 = p1+1;
                while(p2 <= pEnd) {
                    addNum += arr[p2];
                    if (addNum > m){
                        break;
                    } else if (addNum == m) {
                        cnt++;
                        break;
                    } else {
                        p2++;
                    }
                }
            }
            p1++;
        }
        return cnt;
    }
}
