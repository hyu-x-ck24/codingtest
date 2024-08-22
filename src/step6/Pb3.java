package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb3 {
    public static void main(String[] args) throws IOException {
        Pb3 pb3 = new Pb3();
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(kb.readLine());
        StringTokenizer st = new StringTokenizer(kb.readLine());

        int[] numberList = new int[N];

        for (int i = 0; i < N; i++) {
            numberList[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(pb3.Solution(numberList));
    }

    public String Solution(int[] numberList) {
        int j;
        for (int i = 1; i < numberList.length; i++) {
            int key = numberList[i];
            for( j = i-1; j>=0 && numberList[j] > key; j--) {
                numberList[j+1] = numberList[j];
            }
            numberList[j+1] = key;
        }
        StringBuilder answer = new StringBuilder();
        for (int num: numberList) {
            answer.append(num);
            answer.append(' ');
        }
        return String.valueOf(answer);
    }

}
