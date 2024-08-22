package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb4 {
    public static void main(String[] args)throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int S = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        int[] inputValue = new int[N];
        st = new StringTokenizer(kb.readLine());
        for (int i = 0 ; i < N; i++) {
            inputValue[i] = Integer.parseInt(st.nextToken());
        }
        kb.close();
        
        Pb4 pb4 = new Pb4();
        System.out.println(pb4.Solution(inputValue, S, N));
    }
    public String Solution(int[] inputValues, int S, int N) {
        int[] cache = new int[S];
        int cacheSize = 0;
        for(int inputValue: inputValues) {
            boolean isCacheMiss = true;
            for(int i = 0; i < cacheSize; i++) {
                if (isCacheMiss && cache[i] == inputValue) {
                    isCacheMiss = false;
                    int tmp = cache[i];
                    cache[i] = cache[0];
                    cache[0] = tmp;
                }
            }
            if (isCacheMiss) {
                if (cacheSize < S) {
                    cacheSize++;
                }
                for (int i = cacheSize - 1; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = inputValue;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int num: cache) {
            answer.append(num);
            answer.append(' ');
        }
        return String.valueOf(answer);
    }
}