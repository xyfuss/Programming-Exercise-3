import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  @Test
  void testExecutePositive() {
    CapitalizeWordsTextCommand test1 = new CapitalizeWordsTextCommand();
    assertEquals("Text To Be Capitalized",test1.execute("text to be capitalized"));
  }
}