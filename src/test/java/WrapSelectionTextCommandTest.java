import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  @Test
  void testExecutePositive() {
    WrapSelectionTextCommand test1 = new WrapSelectionTextCommand("<p>","</p>","selection");
    assertEquals("text with <p>selection</p>", test1.execute("text with selection"));
  }
}