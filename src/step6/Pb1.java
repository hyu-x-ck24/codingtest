package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb1 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(kb.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(kb.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        kb.close();
        Pb1 pb1 = new Pb1();
        System.out.println(pb1.Solution(N, arr));
    }

    public String Solution(int N, int[] arr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            int lt = arr[i];
            int rt = 100;
            int ridx = i + 1;
            for (int j = i + 1; j < N; j++) {
                if (rt > arr[j]) {
                    rt = arr[j];
                    ridx = j;
                }
            }
            if (lt > rt) {
                arr[i] = rt;
                arr[ridx] = lt;
            }
            answer.append(arr[i]);
            answer.append(' ');
        }
        answer.append(arr[N-1]);
        return String.valueOf(answer);
    }
}
