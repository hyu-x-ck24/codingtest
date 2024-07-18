package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb4 {
    public static void main (String[] args)throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str = kb.readLine();
        Pb4 pb4 = new Pb4();
        System.out.println(pb4.Solution(str));   
    }
    public int Solution(String str){
        int answer = 0;
        Stack<Integer> charStack = new Stack<>();
        for(char ch: str.toCharArray()){
            if (Character.isDigit(ch)){
                charStack.push(Integer.parseInt(String.valueOf(ch)));
            } else {
                int a = charStack.pop();
                int b = charStack.pop();
                switch(ch){
                    case '+':
                        charStack.push(b+a);
                        break;
                    case '-':
                        charStack.push(b-a);
                        break;
                    case '/':
                        charStack.push(b/a);
                        break;
                    case '*':
                        charStack.push(b*a);
                        break;
                }
            }
        }
        answer=charStack.pop();
        return answer;
    }
}
