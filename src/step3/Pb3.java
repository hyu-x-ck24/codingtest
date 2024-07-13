package step3;

import java.util.Scanner;

public class Pb3 {
    public static void main(String[] args) {
        Pb3 pb3 = new Pb3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(), k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();
        System.out.println(pb3.Solution(k, arr));
    }

    public int Solution(int k, int[] arr) {
        int tmp = 0;
        for (int i = 0; i<k; i++){
            tmp+=arr[i];
        }
        int max = tmp;

        // 1 2 3 5 6 8 8 9 2 3 9 
        for (int i = k; i<arr.length; i++){
            tmp = tmp - arr[i-k] + arr[i];
            if (tmp > max) max = tmp;
        }
        return max;
    }
}
