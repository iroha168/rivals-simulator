package domain.card.cardpool

import domain.card.{Attack, Cost, Defence, IUnit}

class VenomWorm extends IUnit {
  override val cost = Cost(1)
  override val attack: Attack = Attack(1)
  override val defence: Defence = Defence(1)
}
