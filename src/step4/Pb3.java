package step4;

import java.util.*;
import java.io.*;

public class Pb3 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(kb.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        kb.close();

        Pb3 pb3 = new Pb3();
        System.out.println(pb3.Solution(arr, n, k));
    }

    public String Solution(int[] arr, int n, int k) {
        StringBuilder answer = new StringBuilder();
        int p1 = 0, p2 = p1 + k - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        while (p2 < n) {
            if (p1 == 0) {
                for (int i = p1; i <= p2; i++) {
                    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                }
                cnt = ChkTypeCnt(map);
            } else {
                if (map.get(arr[p1 - 1]) == 1) {
                    cnt--;
                }
                map.put(arr[p1 - 1], map.get(arr[p1 - 1]) - 1);
                if (map.getOrDefault(arr[p2],0) == 0) {
                    cnt ++;
                }
                map.put(arr[p2], map.getOrDefault(arr[p2], 0) + 1);
            }
            answer.append(cnt);
            answer.append(' ');

            p1++;
            p2++;
        }
        return String.valueOf(answer.deleteCharAt(answer.length() - 1));
    }

    public int ChkTypeCnt(HashMap<Integer, Integer> map) {
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                answer++;
            }
        }
        return answer;
    }
}
