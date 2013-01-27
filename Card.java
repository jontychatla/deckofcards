package deckofcards;

public class Card {

  private Rank rank;
  private Suit suit;

  Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public void setSuit(Suit suit) {
    this.suit = suit;
  }
  
  @Override
  public String toString() {
    return rank.getValue() + " "+suit.getValue();
  }
  
}
