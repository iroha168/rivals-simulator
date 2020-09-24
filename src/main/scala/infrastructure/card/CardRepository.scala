package infrastructure.card

import domain.card.{Card, ICardRepository}
import scalikejdbc._
class CardRepository extends ICardRepository{
  override def save(card: Card): Unit = {
  }
}
