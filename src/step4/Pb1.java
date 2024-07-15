package step4;

import java.util.*;

public class Pb1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        kb.close();
        Pb1 pb1 = new Pb1();
        System.out.println(pb1.Solution(str, n));
    }

    public char Solution(String str, int n) {
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 'A':
                    map.put('A', map.getOrDefault('A', 0) + 1);
                    break;
                case 'B':
                    map.put('B', map.getOrDefault('B', 0) + 1);
                    break;
                case 'C':
                    map.put('C', map.getOrDefault('C', 0) + 1);
                    break;
                case 'D':
                    map.put('D', map.getOrDefault('D', 0) + 1);
                    break;
                case 'E':
                    map.put('E', map.getOrDefault('E', 0) + 1);
                    break;
                default:
                    break;
            }
        }
        int max = 0;
        char maxStudent = ' ';
        for (char tmp : map.keySet()) {
            if (map.get(tmp) > max) {
                max = map.get(tmp);
                maxStudent = tmp;
            }
        }
        return maxStudent;
    }
}
