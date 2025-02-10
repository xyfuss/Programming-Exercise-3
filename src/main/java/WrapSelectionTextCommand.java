public class WrapSelectionTextCommand extends WrapTextCommand{
  private String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening,end);
    this.setSelection(selection);
  }

  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    if (selection == null || selection.isEmpty() || selection.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    String replacement = getOpening() + getSelection() + getEnd();
    return text.replace(getSelection(),replacement);
  }
}
