/**
 * The {@code WrapSelectionTextCommand} class extends {@code WrapTextCommand}
 * and provides functionality to wrap a selected portion of text
 * within the given opening and ending strings.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */

public class WrapSelectionTextCommand extends WrapTextCommand {
  /**
   * The substring within the text that will be wrapped.
   */
  private String selection;

  /**
   * Constructs a new {@code WrapSelectionTextCommand} with the specified opening,
   * ending, and selection strings.
   *
   * @param opening the string to be prefixed to the selection.
   * @param end the string to be suffixed to the selection.
   * @param selection the substring within the text that will be wrapped.
   *
   * @throws IllegalArgumentException if {@code selection} is null, empty,
   * or consists only of whitespace
   */
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening,end);
    this.setSelection(selection);
  }

  /**
   * Retrieves the selection string.
   *
   * @return the selection string.
   */
  public String getSelection() {
    return selection;
  }

  /**
   * Sets the selection string.
   *
   * @param selection the new selection string.
   * @throws IllegalArgumentException if {@code selection} is null, empty,
   * or consists only of whitespace.
   */
  public void setSelection(String selection) {
    if (selection == null || selection.isEmpty() || selection.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.selection = selection;
  }

  /**
   * Wraps the selection within the text with the opening and ending strings.
   *
   * @param text the text containing the selection to be wrapped.
   * @return the modified text where the selection
   * is replaced with {@code opening + selection + end}.
   * @throws IllegalArgumentException if {@code text} is null, empty, blank,
   * or does not contain the selection.
   */
  @Override
  public String execute(String text) {
    if ( text == null || text.isEmpty()|| text.isBlank() || !text.contains(getSelection())) {
      throw new IllegalArgumentException();
    }
    String replacement = getOpening() + getSelection() + getEnd();
    return text.replace(getSelection(),replacement);
  }
}
