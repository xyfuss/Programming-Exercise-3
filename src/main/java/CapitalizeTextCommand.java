/**
 * The {@code CapitalizeTextCommand} class implements the {@code TextCommand} interface
 * and provides functionality to capitalize the first letter of a string.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */
public class CapitalizeTextCommand implements TextCommand {
  /**
   * Executes the capitalization operation, transforming the first letter of the first word in the text
   * to uppercase while keeping the remaining characters unchanged.
   *
   * @param text the input text to be processed.
   * @return a new string with the first word capitalized.
   * @throws IllegalArgumentException if the input text is null, empty, blank,
   * or does not contain the target string.
   */
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank() || text.isEmpty()) {
      throw new IllegalArgumentException();
    }
    return text.substring(0,1).toUpperCase() + text.substring(1);
  }
}
