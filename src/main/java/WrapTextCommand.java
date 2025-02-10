public class WrapTextCommand implements TextCommand{
  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    this.setEnd(end);
    this.setOpening(opening);
  }

  public String getOpening() {
    return opening;
  }

  public void setOpening(String opening) {
    if (opening == null || opening.isEmpty() || opening.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.opening = opening;
  }

  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    if (end == null || end.isEmpty() || end.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.end = end;
  }
  public String execute(String text) {
    return this.getOpening() + text + this.getEnd();
  }
}
