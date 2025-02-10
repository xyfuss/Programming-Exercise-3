import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {

  @Test
  void testExecutePositive() {
    WrapTextCommand test1 = new WrapTextCommand("<p>","</p>");
    assertEquals("<p>text to be wrapped</p>",test1.execute("text to be wrapped"));
  }
}