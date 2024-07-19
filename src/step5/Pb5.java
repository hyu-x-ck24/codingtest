package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pb5 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str = kb.readLine();
        Pb5 pb5 = new Pb5();
        System.out.println(pb5.Solution(str));
    }

    public int Solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            char lt = arr[i];
            char rt = arr[i+1];
            if (lt == '(' && rt == ')') {
                answer += stack.size();
            }
            if (lt == '(' && rt == '(') {
                stack.push(0);
            }
            if (lt == ')' && rt == ')') {
                answer += 1;
                stack.pop();
            }
            
        }
        return answer;
    }
}
