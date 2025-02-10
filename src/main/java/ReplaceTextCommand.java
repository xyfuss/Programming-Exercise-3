public class ReplaceTextCommand implements TextCommand {

  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.setReplacement(replacement);
    this.setTarget(target);
  }

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    if (target == null || target.isBlank() || target.isEmpty()) {
      throw new IllegalArgumentException();
    }
    this.target = target;
  }

  public String getReplacement() {
    return replacement;
  }

  public void setReplacement(String replacement) {
    if (replacement == null || replacement.isBlank() || replacement.isEmpty()) {
      throw new IllegalArgumentException();
    }
    this.replacement = replacement;
  }

  public String execute(String text) {
    return text.replace(this.getTarget(),this.getReplacement());
  }




}
