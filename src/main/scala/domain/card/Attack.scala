package domain.card

case class Attack private(value: Int)

object Attack {
  def build(value: Int): Attack = {
    if (value >= 0) Attack(value)
    else Attack(0)
  }
}
