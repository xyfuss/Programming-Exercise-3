import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The {@code CapitalizeWordsTextCommand} class extends {@code CapitalizeTextCommand}
 * and provides functionality to capitalize the first letter of each word in a given text.
 *
 * @author jonastomren
 * @version 1.0.0
 * @since 1.0
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

  /**
   * Executes the capitalization operation, transforming the first letter of each word in the text
   * to uppercase while keeping the remaining characters unchanged.
   *
   * @param text the input text to be processed.
   * @return a new string with each word capitalized.
   * @throws IllegalArgumentException if the input text is null, empty, blank, or does not contain the target string.
   */
  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty() || text.isBlank()) {
      throw new IllegalArgumentException();
    }
    return Arrays.stream(text.split("\\s"))
        .map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1))
        .collect(Collectors.joining(" "));
  }
}
