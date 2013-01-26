package deckofcards;

public enum Suit {

  HEART("H"),
  SPADE("S"),
  DIAMOND("D"),
  CLUB("C");

  private String value;
  
  private Suit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
