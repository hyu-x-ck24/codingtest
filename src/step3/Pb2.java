package step3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pb2 {

    public static void main(String[] args) {
        Pb2 pb2 = new Pb2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < n; i++) {
            mArr[i] = kb.nextInt();
        }
        kb.close();
        System.out.println(pb2.Solution(nArr, mArr));
    }

    public String Solution(int[] arr1, int[] arr2) {
        int p1 = 0, p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                p1++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int tmp: answer) {
            res.append(tmp);
            res.append(' ');
        }
        return String.valueOf(res);
    }
}
