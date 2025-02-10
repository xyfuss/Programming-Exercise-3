/**
 * The {@code CapitalizeSelectionTextCommand} class extends the {@code CapitalizeTextCommand} class
 * and provides functionality to capitalize the first
 * letter of each word of a target selection word.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  /**
   * The selected word to capitalize the first letter of.
   */
  private String selection;

  /**
   * Constructs a new {@code CapitalizeSelectionTextCommand} with the specified selection string.
   *
   * @param selection The string to be replaced.
   * @throws IllegalArgumentException if selection is null, empty, or blank.
   */
  public CapitalizeSelectionTextCommand(String selection) {
    setSelection(selection);
  }

  /**
   * Retrieves the selection word.
   *
   * @return the selection word.
   */
  public String getSelection() {
    return selection;
  }

  /**
   * Sets a new selection word.
   *
   * @param selection the new selection word.
   * @throws IllegalArgumentException if selection is null, empty, or blank.
   */
  public void setSelection(String selection) {
    if (selection == null || selection.isEmpty() || selection.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.selection = selection;
  }

  /**
   * Executes the capitalization operation, transforming the first letter of each of
   * the selection word in the text to uppercase while
   * keeping the remaining characters unchanged.
   *
   * @param text the input text to be processed.
   * @return a new string with the selection words transformed.
   * @throws IllegalArgumentException if the input text is null, empty, blank,
   * or does not contain the target string.
   */
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank() || text.isEmpty() || !text.contains(getSelection())) {
      throw new IllegalArgumentException();
    }
    String replacement = getSelection().substring(0,1).toUpperCase() + getSelection().substring(1);
    return text.replace(getSelection(),replacement);
  }
}
