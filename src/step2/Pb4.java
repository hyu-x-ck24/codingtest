package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pb4 {
    public static void main(String[] args) throws IOException {
        Pb4 pb4 = new Pb4();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(kb.readLine());
        int[] fibo = new int[N];
        fibo[0] = 1; fibo[1] = 1;
        kb.close();
        StringBuilder sb = new StringBuilder();
        sb.append(fibo[0]).append(' ').append(fibo[1]);

        for(int i = 2; i < N; i++){
            fibo[i] = pb4.Solution(fibo[i-1], fibo[i-2]);
            sb.append(' ').append(fibo[i]);
        }
        System.out.println(sb.toString());
    }
    public int Solution (int a, int b){
        return a + b;
    }

}
