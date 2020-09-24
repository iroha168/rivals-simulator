package application.card

import domain.deck.Deck
import domain.hand.Hand

class CardApplicationService {
  def draw(hand: Hand, deck: Deck): (Hand, Deck) = {
    val (card, newDeck) = deck.pop()
    val newHand = hand.add(card)
    (newHand, newDeck)
  }
}
