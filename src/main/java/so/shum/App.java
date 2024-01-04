package so.shum;

public class App {
  public static void main(String[] args) {

    int numberToCheck = 7;
    boolean isEven = evenOddNumber(numberToCheck);


    System.out.println("Is " + numberToCheck + " even? " + isEven);
  }


  public static boolean evenOddNumber(int n) {
    return n % 2 == 0;
  }
}
