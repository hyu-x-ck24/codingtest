package step3;

import java.util.ArrayList;
import java.util.Scanner;

public class Pb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i<n;i++){
            nArr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i<m;i++){
            mArr[i] = sc.nextInt();
        }
        sc.close();
        Pb1 pb1 = new Pb1();
        for(int tmp: pb1.Solution(nArr, mArr)) System.out.print(tmp + " ");
    }
    public ArrayList<Integer> Solution (int[] nArr, int[] mArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < nArr.length && p2 < mArr.length) {
            if (nArr[p1] < mArr[p2]) answer.add(nArr[p1++]);
            else answer.add(mArr[p2++]);
        }
        while(p1 < nArr.length) answer.add(nArr[p1++]);
        while(p2 < mArr.length) answer.add(mArr[p2++]);
        return answer;
    }
    
}
