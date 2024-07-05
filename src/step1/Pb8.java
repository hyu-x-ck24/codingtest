package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb8 {
  public static void main(String[] args) throws IOException {
    Pb8 pb8 = new Pb8();
    // Scanner kb = new Scanner(System.in);
    // String st = kb.nextLine();
    BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
    String st = kb.readLine();
    System.out.println(pb8.Solution(st));
  }

  public String Solution(String st) {
    String answer = "YES";
    StringBuilder alphabetStr = new StringBuilder();
    char[] tmp = st.toCharArray();
    for (int i = 0; i < tmp.length; i++) {
      if (Character.isAlphabetic(tmp[i]))
        alphabetStr.append(tmp[i]);
    }
    String chkWorkd = String.valueOf(alphabetStr).toLowerCase();
    int lt = 0, rt = chkWorkd.length() - 1;
    while (lt < rt) {
      if (chkWorkd.charAt(lt) != chkWorkd.charAt(rt))
        answer = "NO";
      lt++;
      rt--;
    }
    return answer;
  }
}
