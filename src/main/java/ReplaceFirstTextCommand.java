/**
 * The {@code ReplaceFirstTextCommand} class extends {@code ReplaceTextCommand} and provides
 * functionality to replace only the first occurrence of a target substring in a given text.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  /**
   * Constructs a new {@code ReplaceFirstTextCommand} with the specified target and replacement strings.
   *
   * @param target the substring to be replaced.
   * @param replacement the substring to replace the target with.
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target,replacement);
  }

  /**
   * Executes the replacement operation, replacing only the first occurrence of the target substring
   * in the given text.
   *
   * @param text the input text where the replacement will be performed.
   * @return a new string with the first occurrence of the target replaced with the replacement string.
   * @throws IllegalArgumentException if the text is null, empty, blank,
   * or does not contain the target substring.
   */
  @Override
  public String execute(String text) {
    if ( text == null || text.isEmpty()|| text.isBlank() || !text.contains(getTarget())) {
      throw new IllegalArgumentException();
    }
    return text.replaceFirst(getTarget(),getReplacement());
  }
}
