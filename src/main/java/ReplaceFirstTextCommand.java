public class ReplaceFirstTextCommand implements TextCommand{
  private String target;
  private String replacement;

  public ReplaceFirstTextCommand(String target, String replacement) {
    this.setTarget(target);
    this.setReplacement(replacement);
  }
  public void setTarget(String target) {
    if (target == null || target.isBlank() || target.isEmpty()) {
      throw new IllegalArgumentException();
    }
    this.target = target;
  }

  public void setReplacement(String replacement) {
    if (replacement == null || replacement.isBlank() || replacement.isEmpty()) {
      throw new IllegalArgumentException();
    }
    this.replacement = replacement;
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }

  public String execute(String text) {
    return text.replaceFirst(this.getTarget(),this.getReplacement());
  }
}
