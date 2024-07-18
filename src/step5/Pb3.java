package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pb3 {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(kb.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(kb.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] moves = new int[m];
        st = new StringTokenizer(kb.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        Pb3 pb3 = new Pb3();
        System.out.println(pb3.Solution(n, board, m, moves));
    }

    public int Solution(int n, int[][] board, int m, int[] moves) {
        ArrayList<Stack<Integer>> boardStack = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boardStack.add(new Stack<>());
        }
        Stack<Integer> answer = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 0) {
                    boardStack.get(j).push(board[i][j]);
                }
            }
        }

        int cnt = 0; // cnt를 지역 변수로 선언
        for (int move : moves) {
            if (!boardStack.get(move - 1).isEmpty()) {
                int doll = boardStack.get(move - 1).pop();
                if (!answer.isEmpty() && answer.peek() == doll) {
                    answer.pop();
                    cnt += 2;
                } else {
                    answer.push(doll);
                }
            }
        }

        return cnt;
    }
}
