import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  @Test
  void testExecutePositive() {
    CapitalizeSelectionTextCommand test1 = new CapitalizeSelectionTextCommand("selection");
    assertEquals("text with Selection and another Selection",test1.execute("text with selection and another selection"));
  }
}