package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb2 {
    public static void main(String[] args) throws IOException {
        Pb2 pb2 = new Pb2();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str = kb.readLine();
        System.out.println(pb2.Solution(str));
    }

    public String Solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch != ')') {
                stack.push(ch);
            } else {
                boolean isPop = true;
                while (isPop) {
                    char lastPop = stack.pop();
                    if (lastPop == '(') {
                        isPop = false;
                    }
                }
            }
        }
        while(!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        return String.valueOf(answer.reverse());
    }
}
