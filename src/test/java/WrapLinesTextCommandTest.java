import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  @Test
  void testExecutePositive() {
    WrapLinesTextCommand test1 = new WrapLinesTextCommand("<p>","</p>");
    assertEquals("<p>first line</p>\n<p>second line</p>", test1.execute("first line\nsecond line"));
  }
}