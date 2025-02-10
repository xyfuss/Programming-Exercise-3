/**
 * The {@code WrapLinesTextCommand} class extends {@code WrapTextCommand}
 * and provides functionality to wrap lines of text by replacing
 * newline characters with paragraph tags. It also adds paragraph tags to the
 * opening and ending of the lines of text.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */
public class WrapLinesTextCommand extends WrapTextCommand{
  /**
   * Constructs a {@code WrapLinesTextCommand} with the specified opening and ending wrappers.
   *
   * @param opening the opening string to prepend to the text.
   * @param end the ending string to append to the text.
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }
  /**
   * Executes the wrapping operation on the given text, replacing newline characters
   * with paragraph tags and enclosing the text with the specified opening and ending wrappers.
   *
   * @param text the input text to be wrapped.
   * @return the transformed text with paragraph tag replacements and wrapping.
   * @throws IllegalArgumentException if the input text is {@code null}.
   */
  @Override
  public String execute(String text){
    if ( text == null) {
      throw new IllegalArgumentException();
    }
    String result = text.replace("\n","</p>\n<p>");
    return this.getOpening() + result + this.getEnd();
  }
}
