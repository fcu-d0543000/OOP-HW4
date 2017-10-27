package fcu.iecs.oop.tiida;

public class NissanTiida {
  public int count = 0;  
  
  /**
   * this is a tiida display.
   */
  public void tiida() {
    count++;
    for (int i = 0; i < count; i++) {
      for (int j = 0; j < count; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
