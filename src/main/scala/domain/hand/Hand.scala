package domain.hand

import domain.card.Card

case class Hand private(cards: Seq[Card]) {
  def add(card: Card): Hand = copy(cards :+ card)
}

object Hand {
  // TODO 上限10枚を表現する
  def build(cards: Seq[Card]): Hand =
    if(cards.sizeIs <= 10) Hand(cards)
    else ???
}
