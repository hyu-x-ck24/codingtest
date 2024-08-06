package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Pb7 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String a = kb.readLine();
        String b = kb.readLine();

        Pb7 pb7 = new Pb7();
        System.out.println(pb7.Solution(a, b));

    }

    public String Solution(String a, String b) {
        Queue<Character> fsooup = new LinkedList<Character>();
        for (char aChar : a.toCharArray()) {
            fsooup.offer(aChar);
        }
        for (char bChar : b.toCharArray()) {
            if (fsooup.size() != 0) {
                char fpeek = fsooup.peek();
                if (bChar == fpeek) {
                    fsooup.poll();
                }
            }
        }
        if (fsooup.size() == 0) {
            return "YES";
        }
        return "NO";
    }
}
