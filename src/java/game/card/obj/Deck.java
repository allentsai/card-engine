public class Deck{
  private int numCards;
  private ArrayList<Card> cards;
  public Deck(){
  }
  public Card draw(){
    return this.cards.remove(0);
  }

  public void shuffle(){
    //shuffle
  }

  public void insert(Card c, int position = 0){
    this.cards.add(position, c);
  }
}
