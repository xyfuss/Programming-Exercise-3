package replacecommands;

public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target,replacement);
  }

  public String execute(String text) {
    return text.replaceFirst(this.getTarget(),this.getReplacement());
  }
}
