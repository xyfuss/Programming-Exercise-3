public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    setSelection(selection);
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
    if (text == null || text.isBlank() || text.isEmpty() || !text.contains(getSelection())) {
      throw new IllegalArgumentException();
    }
    String replacement = getSelection().substring(0,1).toUpperCase() + getSelection().substring(1);
    return text.replace(getSelection(),replacement);
  }
}
