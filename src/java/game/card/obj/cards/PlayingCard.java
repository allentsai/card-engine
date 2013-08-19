public class PlayingCard implements Card{

  private ArrayList rules;

  public PlayingCard() {
    this.rules = new ArrayList();
  }

  public ArrayList getRules(){
    return this.rules;
  }
}
