package step3;

import java.util.Scanner;

public class Pb5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();
        Pb5 pb5 = new Pb5();
        System.out.println(pb5.Solution(n));
    }

    public int Solution(int n) {
        int p1 = 1;
        int cnt = 0;
        while (p1 < (n / 2 + 1)) {
            int p2 = p1+1;
            int sumNum = p1+p2;
            while(p2 <= (n/2+1)) {
                if (sumNum == n) {
                    cnt++;
                    break;
                }
                if (sumNum < n) {
                    p2++;
                    sumNum += p2;
                }
                if (sumNum > n) break;
            }
            p1++;
        }
        return cnt;
    }

}
