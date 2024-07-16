package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Pb4 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String s = kb.readLine();
        String t = kb.readLine();
        Pb4 pb4 = new Pb4();
        System.out.println(pb4.Solution(s, t));
    }

    public int Solution(String s, String t) {

        int answer = 0;
        char[] arr1 = s.toCharArray(), arr2 = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : arr2) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int p1 = 0;
        int p2 = p1 + t.length() - 1;
        while (p2 < s.length()) {
            HashMap<Character, Integer> tmpMap = new HashMap<>(map);
            for (int i = p1; i <= p2; i++) {
                if (tmpMap.containsKey(arr1[i])) {
                    tmpMap.put(arr1[i], tmpMap.getOrDefault(arr1[i], 0) - 1);
                }
            }

            boolean res = true;
            for (Map.Entry<Character, Integer> entry : tmpMap.entrySet()) {
                if (entry.getValue() != 0) {
                    res = false;
                }
            }
            if (res) {
                answer++;
            }
            p1++;
            p2++;
        }
        return answer;
    }
}
