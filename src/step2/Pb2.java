package step2;

import java.io.IOException;
import java.util.Scanner;

public class Pb2 {
    public static void main(String[] args) throws IOException{
        Pb2 pb2 = new Pb2();

        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] Nstudents = new int[N];
        for (int i = 0; i < N; i++) {
            Nstudents[i] = kb.nextInt();
        }
        kb.close();
        System.out.println(pb2.Solution(Nstudents));
    }
    public int Solution (int[] input) {
        int answer = 1;
        int forwardStudent = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > forwardStudent) {
                answer++;
                forwardStudent = input[i];
            }
        }

        return answer;
    }
}
