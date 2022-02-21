import java.util.Scanner;

class Osztondij {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Balogh Csenge\nSzoft_I_N\n2022.02.17");

    System.out.print("Elért kreditpont: ");
    int creditPoints = sc.nextInt();

    System.out.print("Osztályzatok átlaga: ");
    double gradesMean = sc.nextDouble();

    sc.close();

    double index = creditPoints * gradesMean / 30;

    System.out.println("Ösztöndíjindexe: " + index); 
  }
}
