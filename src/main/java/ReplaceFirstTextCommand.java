public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target,replacement);
  }
  @Override
  public String execute(String text) {
    if ( text == null || text.isEmpty()|| text.isBlank() || !text.contains(getTarget())) {
      throw new IllegalArgumentException();
    }
    return text.replaceFirst(getTarget(),getReplacement());
  }
}
