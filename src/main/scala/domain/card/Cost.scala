package domain.card

case class Cost(value: Int) {
  require(value > 0)
}
