package deckofcards;

public enum Rank {
  
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  KING("K"),
  QUEEN("Q"),
  JACK("J"),
  ACE("A");

  private String value;

  private Rank(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
