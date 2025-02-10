public class WrapLinesTextCommand extends WrapTextCommand{

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }
  @Override
  public String execute(String text){
    String result = text.replace("\n","</p>\n<p>");
    return this.getOpening() + result + this.getEnd();
  }
}
