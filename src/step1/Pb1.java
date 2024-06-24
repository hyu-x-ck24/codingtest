package step1;

import java.util.Locale;
import java.util.Scanner;

public class Pb1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Pb1 pb1 = new Pb1();
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(pb1.solution(input1,input2));
    }
    public int solution(String str, char t) {
        int cnt = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == t)
        // cnt++;
        // }
        for (char a : str.toCharArray()) {
            if (a == t)
                cnt++;
        }
        return cnt;
    }

}
