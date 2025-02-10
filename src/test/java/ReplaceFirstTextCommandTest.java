import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceFirstTextCommandTest {

  @Test
  void testExecutePositive() {
    ReplaceFirstTextCommand test1 = new ReplaceFirstTextCommand("target","replacement");
    assertEquals("text with replacement and target",test1.execute("text with target and target"));
  }
}