package step5;

import java.io.*;
import java.util.*;

public class Pb1 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str = kb.readLine();

        Pb1 pb1 = new Pb1();
        System.out.println(pb1.Solution(str));
    }

    public String Solution(String str) {
        String answer = "YES";
        Stack<Character> a = new Stack<>();
        for (char tmp : str.toCharArray()) {
            if (tmp == '(') {
                a.push(tmp);
            } else {
                if (!a.isEmpty()) {
                    a.pop();
                } else {
                    answer = "NO";
                    return answer;
                }
            }
        }

        if (!a.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }
}
