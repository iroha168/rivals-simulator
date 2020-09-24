package domain.card

import domain.attriute.Summonable

trait IUnit extends Card with Summonable {
  val attack: Attack
  val defence: Defence
}
