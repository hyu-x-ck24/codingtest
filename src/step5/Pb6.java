package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pb6 {
    public static void main(String[] args)throws IOException {
        Pb6 pb6 = new Pb6();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

        System.out.println(pb6.Solution(n, k));
    }

    public int Solution(int n , int k) {
        Queue<Integer> prince = new LinkedList<Integer>();
        for (int i = 1; i<= n;i++ ){
            prince.offer(i);
        }
        int cnt = 1;
        while(prince.size() != 1) {
            if (cnt%k == 0) {
                prince.poll();
            } else {
                prince.offer(prince.poll());
            }
            cnt++;
        }

        return prince.peek();
    }
    
}
