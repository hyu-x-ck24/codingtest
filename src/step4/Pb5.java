package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Pb5 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(kb.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Pb5 pb5 = new Pb5();
        System.out.println(pb5.Solution(arr, n, k));
    }

    public int Solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> setarr = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int u = j+1; u < n; u++) {
                    setarr.add(arr[i] + arr[j] + arr[u]);
                }
            }
        }
        int cnt = 1;
        for (int tmp: setarr){
            if (cnt == k) {
                return tmp;
            }
            cnt++;
        }
        return answer;
    }

}
