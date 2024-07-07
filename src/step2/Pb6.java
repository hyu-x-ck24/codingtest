package step2;

import java.util.Arrays;
import java.util.Scanner;

public class Pb6 {
    public static void main(String[] args) {
        Pb6 pb6 = new Pb6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nwords = new int[n];
        for (int i = 0; i < n; i++) {
            nwords[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(pb6.Solution(nwords));
    }
    public String Solution (int[] arr) {
        int[] reverseArr= new int[arr.length];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = this.reverse(arr[i]);
            if (reverseArr[i] > max) {
                max = reverseArr[i];
            }
        }
        boolean[] sosu = new boolean[max+1];
        Arrays.fill(sosu, true);
        sosu[0] = false; 
        sosu[1] = false; 
        for (int i = 2; i < (max+1)/2; i++){
            for (int j = 2; j*i < max+1; j++) {
                sosu[j*i] = false;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (sosu[reverseArr[i]] == true) {
                answer.append(reverseArr[i]);
                answer.append(' ');
            }
        }
        answer.delete(answer.length()-1, answer.length());
        return String.valueOf(answer);
    }


    public int reverse (int n) {
        StringBuilder st = new StringBuilder();
        st.append(n);
        return Integer.parseInt(String.valueOf(st.reverse()));
    }
}
