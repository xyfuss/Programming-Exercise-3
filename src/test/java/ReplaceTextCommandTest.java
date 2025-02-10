import static org.junit.jupiter.api.Assertions.*;


class ReplaceTextCommandTest {


  @org.junit.jupiter.api.Test
  void testExecutePositive() {
    ReplaceTextCommand test1 = new ReplaceTextCommand("target","replacement");
    assertEquals("text with replacement and replacement",test1.execute("text with target and target"));
  }
}