package step1;

import java.util.Scanner;

public class Pb6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputData = sc.next();
    Pb6 pb6 = new Pb6();
    System.out.println(pb6.Solution(inputData));
    sc.close();
  }

  public String Solution(String iData) {
    char[] iDataCharArray = iData.toCharArray();
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < iData.length(); i++) {
      if (iData.indexOf(iDataCharArray[i]) == i) {
        answer.append(iDataCharArray[i]);
      }
    }
    return answer.toString();
  }
}
