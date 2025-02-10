/**

 The {@code WrapTextCommand} class implements the {@code TextCommand} interface
 and provides functionality to wrap a given text
 with specified opening and closing strings.

 @author jonastomren
 @version 1.0.0
 @since 1.0
 */
public class WrapTextCommand implements TextCommand {

  protected String opening;
  /**
   * The opening string that will be prefixed to the text.
   * */
  protected String end;
  /**
   * The ending string that will be suffixed to the text.
   * */

  /**
   Constructs a new {@code WrapTextCommand} with the specified opening and ending strings.

   @param opening the string to be prefixed to the text.
   @param end the string to be suffixed to the text.

   @throws IllegalArgumentException if either {@code opening} or {@code end} is null, empty,
   or consists only of whitespace.
   */
  public WrapTextCommand(String opening, String end) {
    this.setEnd(end);
    this.setOpening(opening);
  }

  /**
   * Retrieves the opening string.
   *
   * @return the opening string.
   */
  public String getOpening() {
    return opening;
  }
  /**
   * Sets the opening string.
   *
   * @param opening the new opening string
   * @throws IllegalArgumentException if {@code opening} is null,
   * empty, or consists only of whitespace
   */
  public void setOpening(String opening) {
    if (opening == null || opening.isEmpty() || opening.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.opening = opening;
  }
  /**
   * Retrieves the ending string.
   *
   * @return the ending string.
   * */
  public String getEnd() {
    return end;
  }
  /**
   * Sets the end string.
   *
   * @param end the new opening string.
   * @throws IllegalArgumentException if {@code end} is null,
   * empty, or consists only of whitespace.
   */
  public void setEnd(String end) {
    if (end == null || end.isEmpty() || end.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.end = end;
  }

  /**
   * Wraps the given text with the opening and ending strings.
   *
   * @param text the text to be wrapped.
   * @return the wrapped text with the format: {@code opening + text + end}.
   * @throws IllegalArgumentException if {@code text} is null.
   */
  public String execute(String text) {
    if ( text == null ) {
      throw new IllegalArgumentException();
    }
    return this.getOpening() + text + this.getEnd();
  }
}
