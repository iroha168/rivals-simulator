package domain.card

case class Defence private(value: Int)

object Defence {
  def build(value: Int): Defence = {
    if (value >= 0) Defence(value)
    else Defence(0)
  }
}

