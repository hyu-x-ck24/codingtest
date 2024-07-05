package step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pb10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);
        Pb10 pb10 = new Pb10();

        int[] answer1 = pb10.Solution(s, t);
        for (int i = 0; i < answer1.length; i++) {
            System.out.print(answer1[i]);
            if (i != answer1.length - 1)
                System.out.print(" ");
        }
        System.out.println();
        int[] answer2 = pb10.InflearnSolution(s, t);
        for (int i = 0; i < answer2.length; i++) {
            System.out.print(answer2[i]);
            if (i != answer2.length - 1)
                System.out.print(" ");
        }
    }

    public int[] Solution(String s, char t) {
        ArrayList<Integer> tidx = new ArrayList<>();
        char[] chArrayS = s.toCharArray();
        for (int i = 0; i < chArrayS.length; i++) {
            if (chArrayS[i] == t) {
                tidx.add(i);
            }
        }
        int[] answer = new int[s.length()];
        // tidx안에 t의 인덱스들이 들어있음
        // tidx의 갯수만큼 s길이의 int배열 선언
        for (int i = 0; i < s.length(); i++) {
            int tmp = 100;
            for (int j = 0; j < tidx.size(); j++) {
                int absDistance = Math.abs(tidx.get(j) - i);
                if (absDistance < tmp) {
                    tmp = absDistance;
                }
            }
            answer[i] = tmp;
        }
        return answer;
    }

    public int[] InflearnSolution(String s, char t) {
        int[] answer = new int[s.length()];
        int plt = 100;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                plt = 0;
            }
            answer[i] = plt;
            plt++;
        }
        int prt = 100;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                prt = 0;
            } else {
                if (answer[i] > prt) {
                    answer[i] = prt;
                }
            }
            prt++;
        }
        return answer;
    }
}
