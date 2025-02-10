public class CapitalizeTextCommand implements TextCommand{
  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException();
    }
    return text.substring(0,1).toUpperCase();
  }
}
