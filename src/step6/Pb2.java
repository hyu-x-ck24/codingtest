package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb2 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(kb.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(kb.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        kb.close();
        Pb2 pb1 = new Pb2();
        System.out.println(pb1.Solution(N, arr));
    }

    public String Solution(int N, int[] arr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int num: arr) {
            answer.append(num);
            answer.append(' ');
        }

        return String.valueOf(answer);
    }
}
