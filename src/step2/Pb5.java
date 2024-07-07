package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pb5 {
    // 소수 구하기
    /**
     * 2 <= N <= 200,000
     * 200000 개의 배열 선언 후 (boolean) true로 초기화
     */
    public static void main(String[] args)throws IOException {
        Pb5 pb5 = new Pb5();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(kb.readLine());
        kb.close();
        boolean[] answer = pb5.Solution(n);
        int cnt = 0;
        for (int i = 0; i< n; i++) {
            if (answer[i] == true) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public boolean[] Solution(int n){
        boolean[] answer = new boolean[n];
        Arrays.fill(answer, true);
        answer[0] = false;
        answer[1] = false;
        for (int i = 2; i < n; i++) {
            for (int j = 2; i*j < n; j++) {
                answer[i*j] = false;
            }
        }
        return answer;
    } 
}
