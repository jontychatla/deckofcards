package deckofcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements IDeck {

  private List<Card> cards = new ArrayList<Card>(52);

  public Deck() {
    buildDeck();
  }

  private void buildDeck() {
    for(Rank rank : Rank.values()) {
      for(Suit suit : Suit.values()) {
        cards.add(new Card(rank, suit));
      }
    }
  }

  @Override
  public void shuffle() {
    Collections.shuffle(cards);
  }

  @Override
  public Card dealTopCard() {
    if(cards.size() == 0) {
      throw new RuntimeException("Empty Deck");
    }
    return cards.remove(0);
  }

  public static void main(String[] args) {
    Deck deck = DeckFactory.createDeck();
    deck.shuffle();
    System.out.println(deck.cards);
    for(int i = 0; i < 52; i++) {
      System.out.println(deck.dealTopCard());
    }
    System.out.println(deck.cards);
  }
}
