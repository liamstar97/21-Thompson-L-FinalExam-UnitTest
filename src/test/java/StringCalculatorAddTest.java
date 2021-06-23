import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorAddTest {

  /**
   * This test verifies that newly added functionality correctly ignores numbers larger than 1000.
   */
  @Test
  public void ignoresNumbersLargerThan1000Test() {
    assertEquals(20, StringCalculator.add("20, 1001"));
  }

  /**
   * This test verifies that newly added functionality correctly ignores numbers equal to 1000.
   */
  @Test
  public void ignoresNumbersEqualTo1000Test() {
    assertEquals(10, StringCalculator.add("5, 1000, 5"));
  }

  /**
   * This test verifies that newly added functionality continues to allow 0 as a passed in value.
   */
  @Test
  public void stillAccepts0Test() {
    assertEquals(6, StringCalculator.add("0, 1, 5"));
  }

  /**
   * This test verifies that newly added functionality throws an IllegalArgumentException if a negative value is
   * passed in.
   */
  @Test
  public void throwsExceptionOnNegativeTest() {
    assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1, 5"));
  }
}
