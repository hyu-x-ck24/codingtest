package step1;

import java.util.Scanner;

public class Pb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pb2 pb2 = new Pb2();
        String inData = sc.next();
        System.out.println(pb2.solution(inData));
        sc.close();
    }

    public String solution(String str) {
        StringBuilder result = new StringBuilder();
        // for (int num = 0; num < str.length(); num++) {
        // char ch = str.charAt(num);
        // if (Character.isLowerCase(ch)) {
        // String a = String.valueOf(str.charAt(num)).toUpperCase();
        // result.append(a);
        // } else if (Character.isUpperCase(ch)) {
        // String b = String.valueOf(str.charAt(num)).toLowerCase();
        // result.append(b);
        // }
        // }
        for (char a : str.toCharArray()) {
            String temp = "";
            if (Character.isLowerCase(a)) {
                temp = String.valueOf(a).toUpperCase();
            } else if (Character.isUpperCase(a)) {
                temp = String.valueOf(a).toLowerCase();
            }
            result.append(temp);
        }
        return result.toString();
    }
}
