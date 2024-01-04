package so.shum;

/**
 * Класс {@code App} содержит метод {@code main}, который демонстрирует использование методов
 * {@code evenOddNumber} и {@code NumberChecker.numberInInterval}.
 */
public class App {
  /**
   * Точка входа в приложение. Выводит результаты проверки четности и вхождения в интервал
   * на консоль.
   *
   * @param args
   */
  public static void main(String[] args) {
    int numberToCheckEven = 7;
    boolean isEven = evenOddNumber(numberToCheckEven);
    System.out.println("Is " + numberToCheckEven + " even? " + isEven);

    int numberToCheckInterval = 50;
    boolean isInInterval = NumberChecker.numberInInterval(numberToCheckInterval);
    System.out.println("Is " + numberToCheckInterval + " in the interval? " + isInInterval);
  }

  /**
   * Задание 1
   * Проверяет, является ли переданное число четным.
   *
   * @param n Проверяемое число.
   * @return {@code true}, если число четное, иначе {@code false}.
   */
  public static boolean evenOddNumber(int n) {
    return n % 2 == 0;
  }

  /**
   * Класс {@code NumberChecker} содержит метод {@code numberInInterval}, который проверяет,
   * попадает ли переданное число в интервал (25;100).
   */
  public static class NumberChecker {
    /**
     * Задание 2
     * Проверяет, попадает ли переданное число в интервал (25;100).
     *
     * @param n Проверяемое число.
     * @return {@code true}, если число в интервале, иначе {@code false}.
     */
    public static boolean numberInInterval(int n) {
      return n > 25 && n < 100;
    }
  }
}
