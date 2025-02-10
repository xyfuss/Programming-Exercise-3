import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  @Test
  void testExecutePositive() {
    CapitalizeTextCommand test1 = new CapitalizeTextCommand();
    assertEquals("Text to be capitalized",test1.execute("text to be capitalized"));
  }
}