package domain.card

trait ICardRepository {
  def save(card: Card): Unit
}
