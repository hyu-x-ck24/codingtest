package step1;

import java.util.Arrays;
import java.util.Scanner;

public class Pb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pb4 pb4 = new Pb4();
        int cnt = sc.nextInt();
        String[] strings = new String[cnt];
        for (int n = 0; n < cnt; n++) {
            String tmp = sc.next();
            strings[n] = tmp;
        }
        strings = pb4.solution(cnt, strings);
        for (String str : strings) {
            System.out.println(str);
        }
    }
    public String[] solution (int cnt, String[] strings) {
        String[] reverseStrings = new String[cnt];
        for (int n = 0; n < cnt; n++) {
            String reverseString = new StringBuilder(strings[n]).reverse().toString();
            reverseStrings[n] = reverseString;
        }
        return reverseStrings;
    }
}
