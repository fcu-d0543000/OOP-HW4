package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /**
   * this is a main function.
   * 
   * @param args
   *          this is function start.
   */
  public static void main(String[] args) {
    PasswordEncorder encorder = new PasswordEncorder();
    Scanner scanner = new Scanner(System.in);
    String password;
    do {
      System.out.print("Please enter a password:");
      password = scanner.next();
      System.out.println(encorder.encode(password));
    } 
    while (!password.equalsIgnoreCase("exit"));
    scanner.close();    
  }
}
