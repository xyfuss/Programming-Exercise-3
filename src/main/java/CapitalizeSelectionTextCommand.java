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
}
