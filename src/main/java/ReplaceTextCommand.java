/**
 * The {@code ReplaceTextCommand} class implements the {@code TextCommand} interface
 * and provides functionality to replace occurrences of a target string with a replacement string.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */
public class ReplaceTextCommand implements TextCommand {

  /**
   * The replacement string.
   */
  protected String target;
  /**
   * The target string to be replaced.
   */
  protected String replacement;

  /**
   * Constructs a new {@code ReplaceTextCommand} with the specified target and replacement strings.
   *
   * @param target The string to be replaced.
   * @param replacement The string to replace with.
   * @throws IllegalArgumentException if either target or replacement is null, empty, or blank.
   */
  public ReplaceTextCommand(String target, String replacement) {
    this.setReplacement(replacement);
    this.setTarget(target);
  }
  /**
   * Returns the target string.
   *
   * @return The target string.
   */
  public String getTarget() {
    return target;
  }

  /**
   * Sets the target string.
   *
   * @param target The new target string.
   * @throws IllegalArgumentException if the target is null, empty, or blank.
   */
  public void setTarget(String target) {
    if (target == null || target.isBlank() || target.isEmpty()) {
      throw new IllegalArgumentException();
    }
    this.target = target;
  }

  /**
   * Returns the replacement string.
   *
   * @return The replacement string.
   */
  public String getReplacement() {
    return replacement;
  }

  /**
   * Sets the replacement string.
   *
   * @param replacement The new replacement string.
   * @throws IllegalArgumentException if the replacement is null, empty, or blank.
   */
  public void setReplacement(String replacement) {
    if (replacement == null || replacement.isBlank() || replacement.isEmpty()) {
      throw new IllegalArgumentException();
    }
    this.replacement = replacement;
  }

  /**
   * Executes the text replacement operation.
   *
   * @param text The input text in which the target string will be replaced.
   * @return A new string with all occurrences of the target string replaced with the replacement string.
   * @throws IllegalArgumentException if the input text is null, empty, blank, or does not contain the target string.
   */
  public String execute(String text) {
    if ( text == null || text.isEmpty()|| text.isBlank() || !text.contains(getTarget())) {
      throw new IllegalArgumentException();
    }
    return text.replace(this.getTarget(),this.getReplacement());
  }




}
