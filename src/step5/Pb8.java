package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person {
    int idx;
    int priority;
    public Person(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }
}
public class Pb8 {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(kb.readLine());
        int[] wehumdo = new int[n];

        for (int i = 0; i < n; i++) {
            wehumdo[i] = Integer.parseInt(st.nextToken());
        }
        kb.close();
        Pb8 pb8 = new Pb8();
        System.out.println(pb8.Solution(n, m, wehumdo));
    }

    public int Solution(int n, int m, int[] wehumdo) {
        Queue<Person> patientList = new LinkedList<Person>();
        for (int i = 0; i<n; i++) {
            patientList.offer(new Person(i, wehumdo[i]));
        }
        int myPatient = m;
        int isNowPatient = -1;
        int result = 0;
        while (myPatient != isNowPatient) {
            Person patientTest = patientList.poll();
            if (!IsThisPatientNow(patientTest.priority, patientList)) {
                patientList.offer(patientTest);
            } else {
                isNowPatient = patientTest.idx;
                result++;
            }
        }
        return result;
    }

    public boolean IsThisPatientNow(int patient, Queue<Person> patientList) {
        for (Person tmp : patientList) {
            if (patient < tmp.priority)
                return false;
        }
        return true;
    }
}
