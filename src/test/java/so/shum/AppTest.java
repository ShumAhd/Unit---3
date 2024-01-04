package so.shum;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class AppTest {

  @Test
  public void testEvenNumber() {
    assertTrue(App.evenOddNumber(4)); // Проверяем четное число
    assertTrue(App.evenOddNumber(0)); // Проверяем ноль (тоже четное)
  }

  @Test
  public void testOddNumber() {
    assertFalse(App.evenOddNumber(7)); // Проверяем нечетное число
    assertFalse(App.evenOddNumber(-3)); // Проверяем отрицательное нечетное число
  }

  @Test
  public void testZero() {
    assertTrue(App.evenOddNumber(0)); // Проверяем, что ноль считается четным
  }
  @Test
  public void testOtherOddNumbers() {
    assertFalse(App.evenOddNumber(1)); // Нечетное положительное число
    assertFalse(App.evenOddNumber(-5)); // Нечетное отрицательное число
  }

  @Test
  public void testEvenNumbers() {
    assertTrue(App.evenOddNumber(8));  // Проверяем четное положительное число
    assertTrue(App.evenOddNumber(-10)); // Проверяем четное отрицательное число
  }


}
