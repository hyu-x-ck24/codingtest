package step1;

import java.util.Scanner;

public class Pb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pb5 pb5 = new Pb5();
        String inputData = sc.next();
        System.out.println(pb5.solution(inputData));
    }

    public String solution(String inputData) {
        char[] charStrInput = inputData.toCharArray();
        int ltIndex = 0;
        int rtIndex = inputData.length() - 1;
        while (ltIndex < rtIndex) {
            if (!Character.isAlphabetic(charStrInput[ltIndex])) {
                ltIndex++;
            } else if (!Character.isAlphabetic(charStrInput[rtIndex])) {
                rtIndex--;
            } else {
                char tmp = charStrInput[ltIndex];
                charStrInput[ltIndex] = charStrInput[rtIndex];
                charStrInput[rtIndex] = tmp;
                ltIndex++;
                rtIndex--;
            }
        }

        return new String(charStrInput);
    }
}
