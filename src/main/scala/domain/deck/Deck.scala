package domain.deck

import domain.card.Card


case class Deck(cards: Seq[Card]) {
  def popN(n: Int): (Seq[Card],Deck) =
    (cards.take(n), copy(cards.drop(n)))

  def pop(): (Card, Deck) = {
    val (newCards, newDeck) = popN(1)
    (newCards(0), newDeck)
  }
}

// TODO レジェンドが1枚、その他は2枚までとする制限を実装する

