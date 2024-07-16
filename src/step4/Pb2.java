package step4;

import java.util.*;

public class Pb2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        kb.close();
        Pb2 pb2 = new Pb2();
        System.out.println(pb2.Solution(str1, str2));
    }

    public String Solution(String str1, String str2) {
        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char tmp : arr1) {
            map1.put(tmp, map1.getOrDefault(tmp, 0) + 1);
        }
        for (char tmp : arr2) {
            map2.put(tmp, map2.getOrDefault(tmp, 0) + 1);
        }

        if (!isTwoHashMapComp(map1, map2)) {
            return "NO";
        }

        return "YES";
    }

    public boolean isTwoHashMapComp(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || map2.get(entry.getKey()) != map1.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

}
