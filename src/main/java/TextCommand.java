/**
 * The {@code TextCommand} interface defines the
 * {@code execute} method for implementing classes to use.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */

public interface TextCommand {
  /**
   * Executes a text transformation on the given input.
   *
   * @param text the input text to be processed.
   * @return the transformed text.
   */
  String execute(String text);
}
