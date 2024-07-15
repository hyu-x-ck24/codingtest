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
        HashMap <Character, Integer> str1Map = new HashMap<>();
        HashMap <Character, Integer> str2Map = new HashMap<>();
        for (char tmp : str1.toCharArray()) {
            str1Map.put(tmp, str1Map.getOrDefault(tmp, 0)+1));
        }
        for (char tmp : str2.toCharArray()) {
            str2Map.put(tmp, str2Map.getOrDefault(tmp, 0)+1));
        }
        if (this.isTwoHashMapComp(str1Map, str2Map)){
            return "YES";
        }
        return "NO";
    }

    public boolean isTwoHashMapComp(HashMap<Character, Integer> str1Map, HashMap<Character, Integer> str2Map) {
        if (str1Map.size() != str2Map.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : str1Map.entrySet()) {
            if (!str2Map.containsKey(entry.getKey()) || !str2Map.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

}
