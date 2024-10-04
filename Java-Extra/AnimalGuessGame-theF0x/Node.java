public abstract class Node {
  private ContentItem content;

  public boolean isAnswer() {
    if (content instanceof Answer)
      return true;
    return false;
  }

  public boolean isQuestion() {
    if (content instanceof Question)
      return true;
    return false;
  }
}