package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /**
   * this is a main that call Tiida function.
   * @param args function started.
   */
  public static void main(String[] args) {
    NissanTiida tiida = new NissanTiida();
    int times;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number:");
    times = scanner.nextInt();
    for (int i = 0; i < times; i++) {
      tiida.tiida();
    }
    scanner.close();
  }
}
