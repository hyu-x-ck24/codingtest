package step1;

import java.util.Scanner;

public class Pb7 {
  public static void main(String[] args) {
    Pb7 pb7 = new Pb7();
    Scanner sc = new Scanner(System.in);
    String kb = sc.next();
    sc.close();

    System.out.println(pb7.Solution(kb));
  }

  public String Solution(String idata) {
    String ans = "YES";
    char[] cArray = idata.toCharArray();
    int lt = 0, rt = idata.length() - 1;
    while (lt < rt) {
      if (Character.toLowerCase(cArray[lt]) != Character.toLowerCase(cArray[rt])) {
        ans = "NO";
      }
      lt++;
      rt--;
    }
    return ans;
  }
}
